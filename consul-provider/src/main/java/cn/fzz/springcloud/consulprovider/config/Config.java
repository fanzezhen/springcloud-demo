package cn.fzz.springcloud.consulprovider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Andy on 2018/12/17.
 * Desc:
 */
@ConfigurationProperties(prefix = "config")
public class Config {
    private String title; //name要与consul上面的title写的一样

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title : ["+title+"] ";
    }
}
