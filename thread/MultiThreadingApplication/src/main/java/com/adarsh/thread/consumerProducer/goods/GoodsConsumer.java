package com.adarsh.thread.consumerProducer.goods;

public class GoodsConsumer implements Runnable{
	
	Thread t;
	GoodShop g;
	
	public GoodsConsumer(GoodShop g) {
		this.g = g;
		t=new Thread(this);
		t.start();
	}
	
    public void run(){
    	try{
    	   while(true){
    		   Thread.sleep(500);
    		g.get();
    	   }
    	}catch(InterruptedException e){
    		System.out.println("Exception Generated "+e);
    	}
    }
}
