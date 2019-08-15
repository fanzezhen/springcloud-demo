package cn.fzz.springcloud.consul.startup;

import cn.fzz.springcloud.consul.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling  //启用后，会定时拉取配置
@EnableDiscoveryClient
@EnableConfigurationProperties({Config.class})//指定配置类
@SpringBootApplication(scanBasePackages = "cn.fzz.springcloud.consul")
public class ConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }

}

