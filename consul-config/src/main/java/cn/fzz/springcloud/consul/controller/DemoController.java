package cn.fzz.springcloud.consul.controller;

import cn.fzz.springcloud.consul.config.ApplicationConfig;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Andy on 2018/12/17.
 * Desc:
 */
@RefreshScope   //动态刷新参数
@RestController
public class DemoController {
    @Resource
    private ApplicationConfig config;

    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        return config.toString();
    }

    @RequestMapping(value = "/getTitle")
    public String getTitle() {
        return config.getTitle();
    }

}
