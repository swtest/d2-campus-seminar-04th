/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ApplicationContext 클래스 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Configuration
@ComponentScan({ "com.naver.d2.springtutorial.dao", "com.naver.d2.springtutorial.service" })
public class AppConfig {

}
