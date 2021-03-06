package com.test.lzeureka.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.Map;

/**
 * 描述：客户端负载均衡的访问服务端，如果8761挂了 会自动访问负载的其他注册中 （8762）
 *
 * @author : lizhao
 * @Title: TestController
 * @Package: com.test.lzeureka.api
 * @ProjectName lz_test
 * @Description: TODO
 * @date 2019-04-12  9:39
 */
@RestController
@RequestMapping("/")
public class TestController {

//    @Value("${server.port}")
//    RestTemplate post;

    @RequestMapping("/")
    public String getHello(){
        String url= "http://lz-eureka-server01:8761";
//        String forObject = restTemplate.getForObject(url, String.class);
        return "这是spring could Client01访问。";
    }
}
