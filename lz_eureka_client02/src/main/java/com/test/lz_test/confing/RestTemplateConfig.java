/*
package com.test.lz_test.confing;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

*/
/**
 * 描述： 配置RestTemplate
 *
 * @author : lizhao
 * @Title: RestTemplateConfig
 * @Package: com.test.lzeureka.confing
 * @ProjectName lz_test
 * @Description: TODO
 * @date 2019-04-12  9:43
 *//*


@Configuration
public class RestTemplateConfig {

    @Bean   //把restTemplate注入到容器里面
    @LoadBalanced   //开启了客户端负载均衡功能
    public RestTemplate restTemplate() {
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setConnectionRequestTimeout(3000);
        httpRequestFactory.setConnectTimeout(3000);
        httpRequestFactory.setReadTimeout(5000);
        return new RestTemplate(httpRequestFactory);
    }

}

*/
