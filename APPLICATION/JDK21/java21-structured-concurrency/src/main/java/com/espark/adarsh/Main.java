package com.espark.adarsh;

import com.espark.adarsh.bean.Accounts;
import com.espark.adarsh.bean.User;

import java.util.concurrent.StructuredTaskScope;
import java.util.function.Supplier;

public class Main{


    public void main() throws InterruptedException {

        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

            Supplier<User> userSupplier = scope.fork(() -> getUser());
            Supplier<Accounts> accountsSupplier = scope.fork(() -> getAccounts());

            scope.join();	
            scope.throwIfFailed(e -> new RuntimeException("Execution Failed "+e.getLocalizedMessage() ));

            String response =  userSupplier.get()+" "+ accountsSupplier.get();
            System.out.println(response);

        }
    }

    public static User getUser() throws InterruptedException {
        System.out.println("waiting for user data");
        Thread.sleep(2000L);
        System.out.println("waiting over for user data");
        return new User(1,"User No 1");
    }

    public static Accounts getAccounts()throws InterruptedException {
        System.out.println("waiting for account date ");
        Thread.sleep(2000L);
        System.out.println("waiting over for account date ");
        return new Accounts(1,"Saving ");
    }


}

