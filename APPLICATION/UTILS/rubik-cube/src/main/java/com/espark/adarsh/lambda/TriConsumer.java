package com.espark.adarsh.lambda;

@FunctionalInterface
public interface TriConsumer <T1,T2,T3>{
    public void apply(T1 t1,T2 t2,T3 t3);
}
