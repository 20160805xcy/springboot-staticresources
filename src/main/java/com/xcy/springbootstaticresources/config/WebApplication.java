package com.xcy.springbootstaticresources.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xcy
 * @date 2018/12/07 15:17
 * @description web配置类
 * @since V1.0.0
 */
@Configuration
public class WebApplication implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 将访问静态资源的路径添加一层转换. 如访问/guess/110/resources/Penguins.jpg-->内部自动跳转到/Penguins.jpg
         */
        registry.addResourceHandler("guess/110/resources/**")
                .addResourceLocations("classpath:/static/");
    }
}
