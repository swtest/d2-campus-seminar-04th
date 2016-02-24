/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.service;

import com.naver.d2.springtutorial.domain.Account;
import com.naver.d2.springtutorial.domain.Money;

/**
 * 계좌이체 서비스
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public interface AccountTransferService {

    /**
     * 계좌를 개설하다. 
     * 
     * @param account 계좌 
     */
    public void open(Account account);

    /**
     * 계좌를 조회하다.
     * 
     * @param depositor 예금주
     * @return 계좌. 없을 경우 <code>null</code>을 리턴함.
     */
    public Account inquiryAccount(String depositor);

    /**
     * 계좌이체하다. 
     * 
     * @param fromDepositor 보내는 계좌 예금주  
     * @param toAccount 받는 계좌 예금주 
     * @param money 보내는 돈 
     */
    public void transfer(String fromDepositor, String toDepositor, Money money);

}
