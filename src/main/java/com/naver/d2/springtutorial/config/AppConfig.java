/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.naver.d2.springtutorial.config.aop.LoggingAspect;

/**
 * ApplicationContext 클래스 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({ "com.naver.d2.springtutorial.dao", "com.naver.d2.springtutorial.service" })
public class AppConfig {
    
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

}
