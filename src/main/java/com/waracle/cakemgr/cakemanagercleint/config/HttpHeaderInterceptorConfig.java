package com.waracle.cakemgr.cakemanagercleint.config;

import com.waracle.cakemgr.cakemanagercleint.interceptor.HttpHeaderInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
@RequiredArgsConstructor
public class HttpHeaderInterceptorConfig extends WebMvcConfigurerAdapter {
    private final HttpHeaderInterceptor httpHeaderInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(httpHeaderInterceptor);
    }
}
