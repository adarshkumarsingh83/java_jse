/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.jsdk;
/*
 * {@inheritDoc}
*/

/**
 * @Product : ComplierMain provide implementation of the specification
 *                    provided for the ...    
 */


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 8/7/13 3:16 PM
 * @see
 */

public class ComplierMain {

    public static void main(String[] args) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        String program = "package com.adarsh.jsdk;" +
                "class Test{  " +
                "public static void main (String [] args){  " +
                "System.out.println (\" Java Dynamic Compilation and execution Sample \");  " +
                "System.out.println (args.length);  " +
                "}" +
                " }";
        Iterable<? extends JavaFileObject> fileObjects;
        fileObjects = getJavaSourceFromString(program);
        String[] compileOptions = new String[]{"-d", "out\\production\\JavaToolApplication2"} ;
        Iterable<String> compilationOptions = Arrays.asList(compileOptions);
        compiler.getTask(null, null, null, compilationOptions, null, fileObjects).call();
        Class<?> clazz = Class.forName("com.adarsh.jsdk.Test");
        Method m = clazz.getMethod("main", new Class[] { String[].class });
        Object[] _args = new Object[] { new String[0] };
        m.invoke(null, _args);
    }
    static Iterable<JavaSourceFromString> getJavaSourceFromString(String code) {
        final JavaSourceFromString jsfs = new JavaSourceFromString("com.adarsh.jsdk.Test", code);
        return new Iterable<JavaSourceFromString>() {
            public Iterator<JavaSourceFromString> iterator() {
                return new Iterator<JavaSourceFromString>() {
                    boolean isNext = true;
                    public boolean hasNext() {
                        return isNext;
                    }
                    public JavaSourceFromString next() {
                        if (!isNext)
                            throw new NoSuchElementException();
                        isNext = false;
                        return jsfs;
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
