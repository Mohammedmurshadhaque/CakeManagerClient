package com.waracle.cakemgr.cakemanagercleint.config;

import com.waracle.cakemgr.cakemanager.api.ApiClient;
import com.waracle.cakemgr.cakemanager.api.cleint.CakeManagerApi;
import com.waracle.cakemgr.cakemanagercleint.interceptor.HttpHeaderInterceptor;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CakeManagerClientConfig {
    public static final String AUTHORIZATION = "Authorization";
    private final HttpHeaderInterceptor httpHeaderInterceptor;

    @Bean
    public CakeManagerApi getCakeManagerApi() {
        ApiClient apiClient = new ApiClient();
        apiClient.addAuthorization(AUTHORIZATION, new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header(AUTHORIZATION, httpHeaderInterceptor.getAccessToken());
            }
        });
        return apiClient.buildClient(CakeManagerApi.class);
    }
}
