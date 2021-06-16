package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.cloud.netflix.hystrix.EnableHystrix;import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix //添加@EnableCircuitBreaker或@EnableHystrix注解，开启断路器功能。
@EnableFeignClients
@SpringBootApplication
public class EurekaConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignHystrixApplication.class, args);
    }

}
