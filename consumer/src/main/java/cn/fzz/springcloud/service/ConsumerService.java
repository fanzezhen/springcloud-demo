package cn.fzz.springcloud.service;

import cn.fzz.springcloud.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private ProducerRemote producerRemote;

    public String consumer(){

        return producerRemote.producer();
    }


}
