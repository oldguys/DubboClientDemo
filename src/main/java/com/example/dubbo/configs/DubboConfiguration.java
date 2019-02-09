package com.example.dubbo.configs;/**
 * Created by Administrator on 2018/11/14 0014.
 */

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: ren
 * @CreateTime: 2018-11-2018/11/14 0014 21:52
 */
//@Configuration
//@DubboComponentScan(basePackages = "com.example.dubbo.services")
public class DubboConfiguration {

//    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer-demo1");
        return applicationConfig;
    }

//    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }

//    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("127.0.0.1:6379");
//        registryConfig.setProtocol("redis");

        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setProtocol("zookeeper");

//        registryConfig.setClient("curator");
        return registryConfig;
    }
}
