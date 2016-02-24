/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.dao;

/**
 * Dao 팩토리 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class DaoFactory {

    /** Dao 팩토리 인스턴스  */
    private final static DaoFactory INSTANCE = new DaoFactory();

    /** 계좌 Dao */
    private AccountDao accountDao;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * 생성자 
     */
    private DaoFactory() {
        this.accountDao = new AccountDaoImpl();
    }

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * @return Dao 팩토리 인스턴스
     */
    public static DaoFactory getInstance() {
        return INSTANCE;
    }

    // -------------------------------------------------------------------------
    // Getter
    // -------------------------------------------------------------------------

    /**
     * @return 계좌 Dao
     */
    public AccountDao getAccountDao() {
        return accountDao;
    }

}
