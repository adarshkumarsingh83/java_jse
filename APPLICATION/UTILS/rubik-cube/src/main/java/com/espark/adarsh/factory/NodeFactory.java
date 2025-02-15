package com.espark.adarsh.factory;

import com.espark.adarsh.bean.Node;
import org.springframework.stereotype.Service;

@Service
public class NodeFactory<T>{

     public Node<T> getNode(T date){
         return new Node<T> (date,null,null,null,null);
     }

}
