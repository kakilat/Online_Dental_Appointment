package com.example.adminservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootTest
@EnableEurekaClient
@EnableFeignClients

class AdminServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
