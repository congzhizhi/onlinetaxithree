package com.mashibing.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author Cong ZhiZzhi
 * @Date 2021-02-12 13:19
 * @Version 1.0
 */
@Component
public class TestEvent {
    @EventListener
    public void event(EurekaInstanceCanceledEvent canceledEvent){
        System.out.println("服务下线："+canceledEvent.getAppName()+":"+canceledEvent.getServerId()+":"+canceledEvent.getSource());
    }
}
