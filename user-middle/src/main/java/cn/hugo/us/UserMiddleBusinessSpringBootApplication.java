package cn.hugo.us;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class UserMiddleBusinessSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserMiddleBusinessSpringBootApplication.class,args);
    }
}