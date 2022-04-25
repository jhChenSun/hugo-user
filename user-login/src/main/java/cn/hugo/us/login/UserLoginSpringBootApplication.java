package cn.hugo.us.login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("cn.*")
@MapperScan(basePackages= {"cn.hugo.us.*","cn.cskj.hugo.base.dao.*"})
public class UserLoginSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserLoginSpringBootApplication.class,args);
    }
}
