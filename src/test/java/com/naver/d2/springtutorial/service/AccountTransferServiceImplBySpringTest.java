/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.naver.d2.springtutorial.config.AppConfig;
import com.naver.d2.springtutorial.domain.Account;
import com.naver.d2.springtutorial.domain.Money;

/**
 * AccountTransferServiceImpl 테스트케이스(with 스프링)
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class AccountTransferServiceImplBySpringTest {

    /** 계좌이체 서비스 */
    @Autowired
    private AccountTransferService accountTransferService;

    /** transfer 테스트 */
    @Test
    public void testTransfer() {
        this.accountTransferService.open(new Account("최영목", new Money(10000L)));
        this.accountTransferService.open(new Account("최서미", new Money(5000L)));

        this.accountTransferService.transfer("최영목", "최서미", new Money(3000L));

        Account fromAccount = this.accountTransferService.inquiryAccount("최영목");
        Account toAccount = this.accountTransferService.inquiryAccount("최서미");
        assertThat(fromAccount.getAmount(), is(new Money(7000L)));
        assertThat(toAccount.getAmount(), is(new Money(8000L)));
    }

}
