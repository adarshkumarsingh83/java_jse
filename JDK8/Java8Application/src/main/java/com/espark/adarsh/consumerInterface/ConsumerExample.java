package com.espark.adarsh.consumerInterface;

import java.util.function.Consumer;

/**
 * Created by Adarsh on 6/24/15.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        final BankConsumer bankConsumer=new BankConsumer(100,"adarsh",1000d);
        final Bank bank=new Bank();
         bank.update(bankConsumer,consumer -> consumer.setAccountBalance(consumer.getAccountBalance()+500D));
         bank.update(bankConsumer,consumer -> consumer.setAccountBalance(consumer.getAccountBalance()-100D));
    }
}

class Bank{

    public void update(BankConsumer bankConsumer,Consumer<BankConsumer> bankConsumerConsumer){
        System.out.println("Before Change "+bankConsumer);
        bankConsumerConsumer.accept(bankConsumer);
        System.out.println("After Change "+bankConsumer);
    }
}

class BankConsumer{

    private Integer consumerId;
    private String consumerName;
    private Double accountBalance;

    public BankConsumer() {
    }

    public BankConsumer(Integer consumerId, String consumerName, Double accountBalance) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.accountBalance = accountBalance;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankConsumer{" +
                "consumerId=" + consumerId +
                ", consumerName='" + consumerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}



