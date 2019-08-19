package com.cloud.roc.business.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author rocpeng
 */
@SpringBootApplication(scanBasePackages = "com.cloud.roc")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.cloud.roc.business.demo.mapper")
@EnableSwagger2
public class DemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoProviderApplication.class, args);
    }
}
