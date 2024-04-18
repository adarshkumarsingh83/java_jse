package com.espark.adarsh.claszz;

public sealed interface MessageClazz permits GreetClazz, WishClazz {
    String getMessage();
}
