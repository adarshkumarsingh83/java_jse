package com.adarsh.test;

/**
 * Created by Adarsh on 1/14/16.
 */
public class Sample {
    public static void main(String[] args) {
        int[] array={5,1,4,6,7,8,4,3,7,9};
        int result=0;
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i;j<array.length;j++){
                if(array[i] < array[j]){
                    temp=array[j];
                }
            }
            if(  temp - array[i] > result){
                result=(temp-array[i]);
            }
        }
        System.out.println("Result "+result);
    }
}
