package com.example.ms.client;

import com.example.ms.client.auto.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.TimeZone;

/**
 * @author wangwenchang
 * @date 2018/4/25 11:07
 */
@SpringBootApplication(exclude = ElasticsearchAutoConfiguration.class)
@EnableEurekaClient
@EnableSwagger
public class ClientApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }
}
