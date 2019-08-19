package com.cloud.roc.dto;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author rocpeng
 * 相应工厂
 */
public class BaseResultFactory<T extends AbstractBaseModel> {

    public static final String LONG_LEVEL = "debug";

    private static BaseResultFactory baseResultFactory;

    private static HttpServletResponse response;

    private BaseResultFactory() {

    }

    public static BaseResultFactory getInstance(HttpServletResponse response) {
        if (baseResultFactory == null) {
            synchronized (BaseResultFactory.class) {
                if (baseResultFactory == null) {
                    baseResultFactory = new BaseResultFactory();
                }
            }
        }
        BaseResultFactory.response = response;
        baseResultFactory.initResponse();
        return baseResultFactory;
    }

    /**
     * 构建单笔数据结果
     *
     * @param self
     * @return
     */
    public AbstractBaseResult build(String self, T attributes) {
        return new SuccessResult(self, attributes);
    }

    /**
     * 构建多笔数据结果集
     *
     * @param self
     * @param next
     * @param last
     * @return
     */
    public AbstractBaseResult build(String self, int next, int last, List<T> attributes) {
        return new SuccessResult(self, next, last, attributes);
    }

    /**
     * 构建请求错误的请求结构
     *
     * @param code
     * @param title
     * @param detail
     * @param logLevel 根据日志姐别判断是否传递详情
     * @return
     */
    public AbstractBaseResult build(int code, String title, String detail, String logLevel) {
        response.setStatus(code);
        if (LONG_LEVEL.equals(logLevel)) {
            return new ErrorResult(code, title, detail);
        }
        return new ErrorResult(code, title, null);
    }

    private void initResponse(){
        response.setHeader("Content-type","application/vnd.api+json");
    }

}
