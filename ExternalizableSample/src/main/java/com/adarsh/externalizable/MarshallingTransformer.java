package com.adarsh.externalizable;

import com.adarsh.entity.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 18/2/13
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class MarshallingTransformer {

    public boolean saveIntoFile(String fileName, Entity... entityArray) {
        try {
            File file=new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeInt(entityArray.length);
            for (Entity entity : entityArray) {
                objectOutputStream.writeObject(entity);
            }
            objectOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public List<Entity> readFromFile(String fileName) {
        final List<Entity> entityList = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            int length=objectInputStream.readInt();
            Object object = null;
            while(length>0) {
                object = objectInputStream.readObject();
                if (object != null) {
                    Entity entity = (Entity) object;
                    entityList.add(entity);
                }
                length--;
            }

            return entityList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
