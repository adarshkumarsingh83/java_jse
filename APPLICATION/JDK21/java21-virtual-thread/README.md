# java21-virtual-thread

---

* * mvn clean package
* java --enable-preview -cp .\target\java21-virtual-thread.jar com.espark.adarsh.Main  adarsh 

```

    public static void virtualThreadWithPool(){
              Runnable runnable = () -> System.out.println("Inside Runnable");

//1
        Thread.startVirtualThread(runnable);

//2
        Thread virtualThread = Thread.ofVirtual().start(runnable);

//3
        var executor = Executors.newVirtualThreadPerTaskExecutor();

        executor.submit(runnable);
    }

    public static void virtualThreadWithBuilder()throws InterruptedException{
        Thread.Builder builder = Thread.ofVirtual().name("worker-", 0);
        Runnable task = () -> {
            System.out.println("Thread ID: " + Thread.currentThread().threadId());
        };

// name "worker-0"
        Thread t1 = builder.start(task);
        t1.join();
        System.out.println(t1.getName() + " terminated");

// name "worker-1"
        Thread t2 = builder.start(task);
        t2.join();
        System.out.println(t2.getName() + " terminated");

// name "worker-2"
        Thread t3 = builder.start(task);
        t3.join();
        System.out.println(t3.getName() + " terminated");
    }

```

