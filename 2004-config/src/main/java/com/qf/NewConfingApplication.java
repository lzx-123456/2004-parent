package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//标注是配置中心的服务端
@EnableConfigServer
//标注为eureka的客户端
@EnableDiscoveryClient
public class NewConfingApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewConfingApplication.class);
    }
}
