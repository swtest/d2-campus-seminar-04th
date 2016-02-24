/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.naver.d2.springtutorial.domain.Account;
import com.naver.d2.springtutorial.domain.Money;

/**
 * AccountTransferServiceImpl 테스트케이스 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class AccountTransferServiceImplTest {

    /** 계좌이체 서비스 */
    private AccountTransferService accountTransferService;

    /** before */
    @Before
    public void before() {
        this.accountTransferService = ServiceFactory.getInstance().getAccountTransferService();
    }

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
