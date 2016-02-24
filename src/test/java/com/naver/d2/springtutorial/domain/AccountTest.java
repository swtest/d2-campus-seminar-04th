/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Account 테스트케이스 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class AccountTest {

    /** transfer 테스트 */
    @Test
    public void testTransfer() {
        Account fromAccount = new Account("최영목", new Money(10000L));
        Account toAccount = new Account("최서미", new Money(5000L));

        fromAccount.transfer(toAccount, new Money(3000L));

        assertThat(fromAccount.getAmount(), is(new Money(7000L)));
        assertThat(toAccount.getAmount(), is(new Money(8000L)));
    }

}
