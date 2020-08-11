package com.adarsh.test;

import com.adarsh.entity.Entity;
import com.adarsh.entity.ExternalizableEntityOne;
import com.adarsh.entity.ExternalizableEntityTwo;
import com.adarsh.externalizable.MarshallingTransformer;

import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 18/2/13
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    @org.junit.Test
    public void testExternalizableProcess(){
        final String filePath="d:"+ File.separator+"data.out";
        MarshallingTransformer marshallingTransformer =new MarshallingTransformer();
        ExternalizableEntityOne externalizableEntityOne=new ExternalizableEntityOne(10,"ExternalizableEntityOne");
        ExternalizableEntityTwo externalizableEntityTwo=new ExternalizableEntityTwo(20,"ExternalizableEntityTwo");

        marshallingTransformer.saveIntoFile(filePath, new Entity[]{externalizableEntityOne, externalizableEntityTwo});

        List<Entity> entityList= marshallingTransformer.readFromFile(filePath);
        for(Entity entity:entityList){
            System.out.println(entity.toString());
        }
    }


    @org.junit.Test
    public void testUddiGeneration(){
        String[] data=new String[]{"adarsh","kumar","adarsh","radha"};
        for(String d:data){
            UUID uuid = UUID.nameUUIDFromBytes(d.getBytes());
            String randomUUIDString = uuid.toString();
            System.out.println("Random UUID String = " + randomUUIDString);
            System.out.println("UUID version       = " + uuid.version());
            System.out.println("UUID variant       = " + uuid.variant());
        }

    }
}
