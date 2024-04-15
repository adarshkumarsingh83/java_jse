package com.espark.adarsh;

import com.espark.adarsh.bean.Accounts;
import com.espark.adarsh.bean.User;
import com.espark.adarsh.bean.UserAccount;

import java.util.concurrent.StructuredTaskScope;
import java.util.function.Supplier;

public class Main {

    public static ScopedValue<UserAccount> scopedValue = ScopedValue.newInstance();

    public void main() throws Exception {

        Main main = new Main();
        UserAccount userAccount = new UserAccount("user1","user-account");
        String userResp = ScopedValue.callWhere(scopedValue, userAccount, () -> {
            return main.getUser();
        });

        String accountResp = ScopedValue.callWhere(scopedValue, userAccount, () -> {
            return main.getAccounts();
        });

        System.out.println(userResp + " "+accountResp);

    }


    public  String getUser() throws InterruptedException {
        System.out.println("waiting for user data "+Thread.currentThread().getName());
        Thread.sleep(2000L);
        System.out.println("waiting over for user data");
        return new User(1,scopedValue.get().userName()).toString();
    }

    public  String getAccounts()throws InterruptedException {
        System.out.println("waiting for account date "+Thread.currentThread().getName());
        Thread.sleep(2000L);
        System.out.println("waiting over for account date ");
        return new Accounts(1,scopedValue.get().accountType()).toString();
    }


}

