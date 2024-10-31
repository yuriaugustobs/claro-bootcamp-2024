package me.dio.domain.model;

import java.math.BigDecimal;

public class Account {

    private Long id; 
    private Number number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }   

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    
}
