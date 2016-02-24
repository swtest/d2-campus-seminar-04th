/*******************************************************************************
 * Copyright(c) SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package com.naver.d2.springtutorial.domain;

/**
 * 돈 
 * 
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Money {

    /** 원 */
    private long won;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * 생성자 
     * 
     * @param won 원 
     */
    public Money(long won) {
        this.won = won;
    }

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * 돈을 더하다. 
     * 
     * @param money 돈 
     * @return 더한 결과(돈)
     */
    public Money add(Money money) {
        if (money == null) return this;
        return new Money(this.won + money.won);
    }

    /**
     * 돈을 빼다. 
     * 
     * @param money 돈 
     * @return 뺀 결과(돈)
     */
    public Money subtract(Money money) {
        if (money == null) return this;
        return new Money(this.won - money.won);
    }

    /**
     * @return 돈(원)
     */
    public long longValue() {
        return this.won;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Money other = (Money) obj;
        if (this.won != other.won) return false;
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (won ^ (won >>> 32));
        return result;
    }

}
