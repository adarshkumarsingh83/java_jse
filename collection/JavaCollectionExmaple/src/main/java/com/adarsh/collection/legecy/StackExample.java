package com.adarsh.collection.legecy;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/17/14
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class StackExample {

    private Stack<String> stack;

    @Before
    public void init() {
        stack = new Stack<String>();
        for(int i=0;i<10;i++){
            stack.push(""+i);
        }
    }

    @Test
    public void basicOperation(){
        while(!stack.empty()){
            System.out.print(stack.pop() + "\t");
        }
    }

    @Test
    public void searchTest(){
        System.out.println(stack.search("10")!= -1?"Position is "+stack.search("0"):"Not Found");
    }

}
