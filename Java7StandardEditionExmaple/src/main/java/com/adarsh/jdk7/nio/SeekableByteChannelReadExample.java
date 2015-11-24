package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:54 PM
 * This Class provide the implementation for the functionality of..
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class SeekableByteChannelReadExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\adarsh\\jdk7\\nio","Sample.txt");
        SeekableByteChannel sbc = Files.newByteChannel(path, StandardOpenOption.READ);
        ByteBuffer bf = ByteBuffer.allocate(1024);
        int i = 0;
        while((i=sbc.read(bf))>0){
            bf.flip();
            System.out.println(i);
            bf.clear();

        }
    }
}
