package com.adarsh.jsdk;

import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * A test class to test dynamic compilation API.
 * 
 */
public class CompilerAPITest {

    final Logger logger = Logger.getLogger(CompilerAPITest.class.getName()) ;
	
	/**Java source code to be compiled dynamically*/
	final static String sourceCode = "package com.adarsh.jsdk;" +
            "class DynamicCompilationHelloWorld{" +
            "public static void main(String args[]){" +
            "System.out.println(\"Hello, dynamic compilation world!\");" +
            "}" +
            "}" ;
	
	/**
	 * Does the required object initialization and compilation.
	 */
	public void doCompilation (){
		/*Creating dynamic java source code file object*/
		SimpleJavaFileObject fileObject = new DynamicJavaSourceCodeObject ("com.adarsh.jsdk.DynamicCompilationHelloWorld", sourceCode) ;
		JavaFileObject javaFileObjects[] = new JavaFileObject[]{fileObject} ;
		
		/*Instantiating the java compiler*/
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		
		/**
		 * Retrieving the standard file manager from compiler object, which is used to provide
		 * basic building block for customizing how a compiler reads and writes to files.
		 * 
		 * The same file manager can be reopened for another compiler task. 
		 * Thus we reduce the overhead of scanning through file system and jar files each time 
		 */
		StandardJavaFileManager stdFileManager = compiler.getStandardFileManager(null, Locale.getDefault(), null);
		
		/* Prepare a list of compilation units (java source code file objects) to input to compilation task*/
		Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(javaFileObjects);
		
		/*Prepare any compilation options to be used during compilation*/
		//In this example, we are asking the compiler to place the output files under bin folder.
		String[] compileOptions = new String[]{"-d", "target/classes"} ;
		Iterable<String> compilationOptions = Arrays.asList(compileOptions);
		
		/*Create a diagnostic controller, which holds the compilation problems*/
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
		
		/*Create a compilation task from compiler by passing in the required input objects prepared above*/
		CompilationTask compilerTask = compiler.getTask(null, stdFileManager, diagnostics, compilationOptions, null, compilationUnits) ;
		
		//Perform the compilation by calling the call method on compilerTask object.
		boolean status = compilerTask.call();
		
		if (!status){//If compilation error occurs
			/*Iterate through each compilation problem and print it*/
			for (Diagnostic diagnostic : diagnostics.getDiagnostics()){
				System.out.format("Error on line %d in %s", diagnostic.getLineNumber(), diagnostic);
			}
		}
		try {
			stdFileManager.close() ;//Close the file manager
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])throws Exception{
		new CompilerAPITest ().doCompilation() ;
        Class<?> clazz = Class.forName("com.adarsh.jsdk.DynamicCompilationHelloWorld");
        Method m = clazz.getMethod("main", new Class[]{String[].class});
        Object[] _args = new Object[] { new String[0] };
        m.invoke(null, _args);
	}

}

