package com.espark.adarsh;

public class MessageRecursiveAction extends java.util.concurrent.RecursiveAction {

    private org.slf4j.Logger logger =
            org.slf4j.LoggerFactory.getLogger(this.getClass());

    private java.util.List<String> message;
    private static int THRESHOLD = 1;

    public MessageRecursiveAction(String messageData,int threadHold){
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

    public MessageRecursiveAction(java.util.List<String> message,int threadHold){
        if(message!=null && !message.isEmpty()) {
            this.message = message;
            THRESHOLD=threadHold;
        }else{
            throw new RuntimeException("Empty Message List");
        }
    }

    @Override
    protected void compute() {
        if (message.size() > THRESHOLD) {
            java.util.List<com.espark.adarsh.MessageRecursiveAction> subTasksList = createSubTasks();
            java.util.concurrent.ForkJoinTask.invokeAll(subTasksList);
        } else {
            this.processingMessage(message.get(0));
        }
    }


    private java.util.List<com.espark.adarsh.MessageRecursiveAction> createSubTasks() {
        java.util.List<com.espark.adarsh.MessageRecursiveAction> subtasks = new java.util.ArrayList<>();
        for(String data:message){
            subtasks.add(new MessageRecursiveAction(data,1));
        }
        return subtasks;
    }


    private void processingMessage(String work) {
        String result = work.toUpperCase();
        logger.info("This result - (" + result + ") - was processed by "+ Thread.currentThread().getName());
        System.out.println("This result - (" + result + ") - was processed by "+ Thread.currentThread().getName());
    }

}
