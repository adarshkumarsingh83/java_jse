package com.espark.adarsh.bean;

public record Accounts(Integer accountId,String accountName) {
    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
