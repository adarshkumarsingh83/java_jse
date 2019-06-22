package com.espark.adarsh;

import com.espark.adarsh.shell.JShellScriptExecutor;

import java.io.File;

public class ApplicationMain {
    public static void main(String[] args) {

        // cmd line argument
        //new JShellScriptExecutor().evaluate(args[0]);

        //file supplied from doc folder
        File shellFile=new File("./doc/java_shell_code.txt");
        new JShellScriptExecutor().evaluate(shellFile.getAbsolutePath());
    }
}
