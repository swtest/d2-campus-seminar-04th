/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.service;

import com.naver.d2.springtutorial.dao.DaoFactory;

/**
 * 서비스 팩토리 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class ServiceFactory {

    /** 서비스 팩토리 인스턴스 */
    private final static ServiceFactory INSTANCE = new ServiceFactory();

    /** 계좌이체 서비스 */
    private AccountTransferService accountTransferService;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * 생성자 
     */
    private ServiceFactory() {
        this.accountTransferService = new AccountTransferServiceImpl();
        ((AccountTransferServiceImpl) this.accountTransferService).setAccountDao(DaoFactory.getInstance().getAccountDao());
    }

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * @return 서비스 팩토리 인스턴스
     */
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    // -------------------------------------------------------------------------
    // Getter
    // -------------------------------------------------------------------------

    /**
     * @return 계좌이체 서비스
     */
    public AccountTransferService getAccountTransferService() {
        return accountTransferService;
    }

}
