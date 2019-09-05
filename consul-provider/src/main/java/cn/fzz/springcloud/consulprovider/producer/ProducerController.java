package cn.fzz.springcloud.consulprovider.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2018/12/17.
 * Desc:
 */
@RestController
public class ProducerController {
    @GetMapping("/producer")
    public String producer(){
        System.out.println("I'm producer");
        return "Hello, I'm provider";
    }
}
