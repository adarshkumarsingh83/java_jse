package com.espark.adarsh.exception;

@FunctionalInterface
public interface ExceptionThrowingConsumer<T, E extends Exception> {
    void accept(T t) throws E;
}
