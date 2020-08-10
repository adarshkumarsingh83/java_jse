package com.espark.adarsh;

import java.util.*;
public class MessageRecursiveTask extends java.util.concurrent.RecursiveTask<java.util.List<String>> {

    private org.slf4j.Logger logger =
            org.slf4j.LoggerFactory.getLogger(this.getClass());

    private java.util.List<String> message;
    private static int THRESHOLD = 1;

    public MessageRecursiveTask(String messageData, int threadHold){
        if(messageData!=null && messageData.length()>0){
           message=new java.util.ArrayList(){
               {
                   add(messageData);
               }
           };
            THRESHOLD=threadHold;
        }else{
            throw new RuntimeException("Empty Message ");
        }
    }

    public MessageRecursiveTask(java.util.List<String> message, int threadHold){
        if(message!=null && !message.isEmpty()) {
            this.message = message;
            THRESHOLD=threadHold;
        }else{
            throw new RuntimeException("Empty Message List");
        }
    }

    @Override
    protected java.util.List<String> compute() {
        java.util.List<String> response=new java.util.ArrayList<>();
        if (message.size() > THRESHOLD) {
            java.util.List<com.espark.adarsh.MessageRecursiveTask> subTasksList = createSubTasks();
            Collection<com.espark.adarsh.MessageRecursiveTask> list = java.util.concurrent.ForkJoinTask.invokeAll(subTasksList);
            for(MessageRecursiveTask messageRecursiveTask:list){
                try {
                   List<String> dataResponse =  messageRecursiveTask.get();
                   response.addAll(dataResponse);
                } catch (InterruptedException | java.util.concurrent.ExecutionException e) {
                   logger.error(e.getLocalizedMessage());
                }
            }
        } else {
            String data = this.processingMessage(message.get(0));
            response.add(data);
        }
        return response;
    }


    private java.util.List<com.espark.adarsh.MessageRecursiveTask> createSubTasks() {
        java.util.List<com.espark.adarsh.MessageRecursiveTask> subTaskList = new java.util.ArrayList<>();
        for(String data:message){
            subTaskList.add(new MessageRecursiveTask(data,1));
        }
        return subTaskList;
    }


    private String processingMessage(String work) {
        String result = work.toUpperCase();
        //logger.info("This result - (" + result + ") - was processed by "+ Thread.currentThread().getName());
       // System.out.println("This result - (" + result + ") - was processed by "+ Thread.currentThread().getName());
        return result;
    }

}
