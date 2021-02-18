package com.mashibing.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
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
    @EventListener
    public void eventRegistry(EurekaInstanceRegisteredEvent registeredEvent){
        System.out.println("服务上线："+registeredEvent.getInstanceInfo().toString());
    }
    @EventListener
    public void renewRegistry(EurekaInstanceRenewedEvent registeredEvent){
        System.out.println("服务续约："+registeredEvent.getInstanceInfo().toString());
    }
}
