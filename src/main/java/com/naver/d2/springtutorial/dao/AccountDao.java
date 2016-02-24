/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.dao;

import com.naver.d2.springtutorial.domain.Account;

/**
 * 계좌 Dao
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public interface AccountDao {

    /**
     * 계좌 생성 
     * 
     * @param account 계좌 
     */
    public void createAccount(Account account);

    /**
     * 계좌 조회
     * 
     * @param depositor 계좌 
     * @return 계좌. 없을 경우 <code>null</code>을 리턴함. 
     */
    public Account readAccount(String depositor);

}
