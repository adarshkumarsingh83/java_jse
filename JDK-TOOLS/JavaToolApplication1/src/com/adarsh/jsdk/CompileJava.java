/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.jsdk;
/*
 * {@inheritDoc}
*/

/**
 * @Product : CompileJava provide implementation of the specification
 *                    provided for the ...    
 */


import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.lang.reflect.Method;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 8/7/13 3:08 PM
 * @see
 */

public class CompileJava {

    public static void main(String[] args) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,
                "src/com/adarsh/jsdk/Sample.java");
        System.out.println("Compile result code = " + result);

        Class<?> clazz = Class.forName("com.adarsh.jsdk.Sample");
        Method clazzMethod = clazz.getMethod("main", new Class[]{String[].class});
        Object[] _args = new Object[]{new String[0]};
        clazzMethod.invoke(null, _args);
    }
}
