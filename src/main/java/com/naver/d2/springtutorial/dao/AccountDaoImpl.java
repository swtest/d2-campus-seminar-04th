/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.dao;

import java.util.HashMap;
import java.util.Map;

import com.naver.d2.springtutorial.domain.Account;

/**
 * AccountDao 구현체 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class AccountDaoImpl implements AccountDao {

    /** 계좌 Map */
    private Map<String, Account> accountMap = new HashMap<String, Account>();

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void createAccount(Account account) {
        this.accountMap.put(account.getDepositor(), account);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account readAccount(String depositor) {
        return this.accountMap.get(depositor);
    }

}
