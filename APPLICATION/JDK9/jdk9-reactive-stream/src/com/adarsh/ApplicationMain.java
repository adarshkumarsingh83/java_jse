package com.adarsh;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.IntStream;

public class ApplicationMain {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher submissionPublisher = new SubmissionPublisher();
        submissionPublisher.subscribe(new Flow.Subscriber<Integer>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                this.subscription.request(Integer.MAX_VALUE);
            }

            @Override
            public void onNext(Integer item) {
                System.out.println(item);
                this.subscription.request(10);
                if (item > 10) {
                    this.subscription.cancel();
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.printf(throwable.getLocalizedMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("done");
            }
        });
        IntStream.rangeClosed(0, 10).forEach(e -> submissionPublisher.submit(e));
        Thread.currentThread().join(100);
    }
}
