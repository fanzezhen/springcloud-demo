package cn.fzz.springcloud.consulconsumer.startup;

import cn.fzz.springcloud.consulconsumer.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({Config.class})//指定配置类
@ComponentScan(basePackages = {"cn.fzz.springcloud"})
@EnableFeignClients(basePackages = {"cn.fzz.springcloud.consulconsumer.remote"})
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}

