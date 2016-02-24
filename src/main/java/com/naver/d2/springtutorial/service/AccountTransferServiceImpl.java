/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.service;

import com.naver.d2.springtutorial.dao.AccountDao;
import com.naver.d2.springtutorial.domain.Account;
import com.naver.d2.springtutorial.domain.Money;

/**
 * AccountTransferService 구현체
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class AccountTransferServiceImpl implements AccountTransferService {

    /** 계좌 Dao  */
    private AccountDao accountDao;

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void open(Account account) {
        this.accountDao.createAccount(account);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account inquiryAccount(String depositor) {
        return this.accountDao.readAccount(depositor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void transfer(String fromDepositor, String toDepositor, Money money) {
        Account fromAccount = this.accountDao.readAccount(fromDepositor);
        Account toAccount = this.accountDao.readAccount(toDepositor);

        fromAccount.transfer(toAccount, money);
    }

    // -------------------------------------------------------------------------
    // Setter
    // -------------------------------------------------------------------------

    /**
     * @param accountDao 계좌 Dao
     */
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
