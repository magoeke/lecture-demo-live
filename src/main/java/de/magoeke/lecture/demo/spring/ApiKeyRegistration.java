package de.magoeke.lecture.demo.spring;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApiKeyRegistration {

    @Bean
    public FilterRegistrationBean<ApiKeyFilter> apiKeyFilter() {
        final var registrationBean = new FilterRegistrationBean<ApiKeyFilter>();

        registrationBean.setFilter(new ApiKeyFilter());
        registrationBean.addUrlPatterns("/roman-numbers/*");

        return registrationBean;
    }

}
