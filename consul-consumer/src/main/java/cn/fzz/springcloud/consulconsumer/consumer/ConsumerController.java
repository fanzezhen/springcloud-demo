package cn.fzz.springcloud.consulconsumer.consumer;

import cn.fzz.springcloud.consulconsumer.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Andy on 2018/12/17.
 * Desc:
 */
@RestController
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String getProducer(){

        return consumerService.consumer();
    }
}
