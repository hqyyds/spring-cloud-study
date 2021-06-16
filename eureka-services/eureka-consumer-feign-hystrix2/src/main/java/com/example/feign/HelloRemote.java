package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;import org.springframework.stereotype.Component;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "eureka-producer",fallback = HelloRemoteHystrix.class)//在服务熔断的时候返回 fallback 类中的内容。
public interface HelloRemote {

    /**
     * 绑定 eureka-producer 服务的 /hello/ 接口
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String helle(@RequestParam("name") String name);
}
