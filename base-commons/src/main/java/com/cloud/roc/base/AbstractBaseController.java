package com.cloud.roc.base;

import com.cloud.roc.dto.AbstractBaseModel;
import com.cloud.roc.dto.AbstractBaseResult;
import com.cloud.roc.dto.BaseResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author rocpeng
 */
public abstract class AbstractBaseController<T extends AbstractBaseModel> {
    protected HttpServletResponse response;
    protected HttpServletRequest request;

    public static final String LOGGING_LEVEL_ROOT = "logging.level.root";

    /**
     * 动态获取 nacos 配置文件
     */
    @Autowired
    private ConfigurableApplicationContext applicationContext;


    @ModelAttribute
    private void initReqAnRes(HttpServletResponse response, HttpServletRequest request) {
        this.request = request;
        this.response = response;
    }

    protected AbstractBaseResult success(String self, T attribute) {
        return BaseResultFactory.getInstance(response).build(self, attribute);
    }


    protected AbstractBaseResult success(String self, int next, int last, List<T> attribute) {
        return BaseResultFactory.getInstance(response).build(self, next, last, attribute);
    }

    protected AbstractBaseResult error(int code, String title, String detail) {
        return BaseResultFactory.getInstance(response).build(code, title, detail, applicationContext.getEnvironment().getProperty("logging.level.root"));
    }

    protected AbstractBaseResult error(String title, String detail) {
        return error(HttpStatus.UNAUTHORIZED.value(), title, detail);
    }


}