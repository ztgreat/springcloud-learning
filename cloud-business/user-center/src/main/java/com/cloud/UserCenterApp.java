package com.cloud;

import com.cloud.common.annotation.EnableLoginArgResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 作者 mallplus E-mail: 951449465@qq.com
 */
@EnableLoginArgResolver
@EnableDiscoveryClient
@EnableFeignClients
@EnableTransactionManagement
@SpringBootApplication
public class UserCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
