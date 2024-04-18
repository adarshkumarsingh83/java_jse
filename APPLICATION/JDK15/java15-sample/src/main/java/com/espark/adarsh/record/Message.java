package com.espark.adarsh.record;

public sealed interface Message permits Greet, Wish{
    String getMessage();
}
