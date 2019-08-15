package cn.fzz.springcloud.consulconsumer.service;

import cn.fzz.springcloud.consulconsumer.remote.ProducerRemote;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsumerService {

    @Resource
    private ProducerRemote producerRemote;

    public String consumer(){

        return producerRemote.producer();
    }


}
