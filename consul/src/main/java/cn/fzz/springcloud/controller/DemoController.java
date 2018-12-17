package cn.fzz.springcloud.controller;

import cn.fzz.springcloud.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2018/12/17.
 * Desc:
 */
@RestController
public class DemoController {
    @Autowired
    private Config config;

    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        return config.toString();
    }

    @RequestMapping(value = "/getTitle")
    public String getTitle() {
        return config.getTitle();
    }
}
