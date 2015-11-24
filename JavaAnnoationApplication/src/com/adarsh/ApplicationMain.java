package com.adarsh;

import com.adarsh.bean.MyMessageBean;
import com.adarsh.processor.BeanProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 9/11/12
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        BeanProcessor beanProcessor= new BeanProcessor();
        beanProcessor.setBeanObject(new MyMessageBean());
        beanProcessor.getClassProfile();
    }
}

