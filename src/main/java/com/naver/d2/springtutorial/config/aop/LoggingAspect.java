/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.config.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.naver.d2.springtutorial.domain.Money;

/**
 * 로깅 AspectJ
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Aspect
public class LoggingAspect {

    @Pointcut("execution(** com.naver.d2.springtutorial.service.AccountTransferService.transfer(..)) && args(fromDepositor, toDepositor, money)")
    public void transfer(String fromDepositor, String toDepositor, Money money) {

    }

    @Before("transfer(fromDepositor, toDepositor, money)")
    public void beforeTransfer(String fromDepositor, String toDepositor, Money money) {
        System.out.println("계좌이체를 시작합니다.");
        System.out.println("보내는 사람 : " + fromDepositor);
        System.out.println("받는 사람 : " + toDepositor);
        System.out.println("금액 : " + money.longValue());
    }

    @After("transfer(fromDepositor, toDepositor, money)")
    public void afterTransfer(String fromDepositor, String toDepositor, Money money) {
        System.out.println("계좌이체를 종료합니다.");
    }

}
