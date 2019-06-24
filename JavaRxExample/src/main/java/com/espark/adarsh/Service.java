package com.espark.adarsh;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;


public class Service {

    public void display(String data){
        Flowable.just(data).subscribe(s -> System.out.println(s));
    }

   //Failed to process
    public void display(Integer[] data,String failMsg){
        Flowable.fromArray(data).subscribe(
                i -> System.out.printf("Entry %d\n", i),
                e -> System.err.printf(failMsg+": %s\n", e),
                () -> System.out.println("Done")
        );
    }

   /* public void display(int x){
        Flowable flowable = Flowable.create((FlowableEmitter emitter) -> {
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onComplete();
        }, BackpressureStrategy.BUFFER);
        flowable.subscribe(System.out::println);
    }*/
}
