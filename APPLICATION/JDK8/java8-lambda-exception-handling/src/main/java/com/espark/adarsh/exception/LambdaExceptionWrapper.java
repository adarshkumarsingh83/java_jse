package com.espark.adarsh.exception;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaExceptionWrapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExceptionWrapper.class);

    public static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (ArithmeticException e) {
                LOGGER.error("Arithmetic Exception occurred.", e);
            }
        };
    }

    public static <T, E extends Exception> Consumer<T> consumer(Consumer<T> consumer, Class<E> clazz) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception ex) {
                try {
                    E exCast = clazz.cast(ex);
                    LOGGER.error("Exception occurred.", exCast);
                } catch (ClassCastException ccEx) {
                    throw ex;
                }
            }
        };
    }

    public static <T> Consumer<T> throwingConsumer(ExceptionThrowingConsumer<T, Exception> throwingConsumer) {
        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }

    public static <T, E extends Exception> Consumer<T> handlingConsumer(ExceptionThrowingConsumer<T, E> throwingConsumer, Class<E> exceptionClass) {
        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                try {
                    E exCast = exceptionClass.cast(ex);
                    LOGGER.error("Exception occurred.", exCast);
                } catch (ClassCastException ccEx) {
                    throw new RuntimeException(ex);
                }
            }
        };
    }
}
