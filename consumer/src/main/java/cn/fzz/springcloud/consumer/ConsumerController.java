package cn.fzz.springcloud.consumer;

import cn.fzz.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2018/12/17.
 * Desc:
 */
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String getProducer(){

        return consumerService.consumer();
    }
}
