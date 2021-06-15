package com.adarsh.jdk7.nio.file;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:49 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;
public class GetFileAttributeViewExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\adarsh\\jdk7\\nio","Sample.txt");
        AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
        if (view != null) {
            List<AclEntry> aclEntryList = view.getAcl();
            for(AclEntry acl: aclEntryList){
                System.out.println(acl.principal().getName()+":"+acl.type());
            }
        }
    }
}
