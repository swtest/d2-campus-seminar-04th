/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.domain;

/**
 * 계좌
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Account {

    /** 예금주 */
    private String depositor;

    /** 잔액 */
    private Money amount;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * 생성자 
     * 
     * @param depositor 예금주 
     * @param amount 잔액 
     */
    public Account(String depositor, Money amount) {
        this.depositor = depositor;
        this.amount = amount;
    }

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * 계좌이체
     * 
     * @param otherAccount 받는 계좌 
     * @param money 보낼 돈 
     */
    public void transfer(Account otherAccount, Money money) {
        this.amount = this.amount.subtract(money);
        otherAccount.amount = otherAccount.amount.add(money);
    }

    // -------------------------------------------------------------------------
    // Getter
    // -------------------------------------------------------------------------

    /**
     * @return 예금주 
     */
    public String getDepositor() {
        return depositor;
    }

    /**
     * @return 잔액 
     */
    public Money getAmount() {
        return amount;
    }

}
