import com.radha.Calculation;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;


/**
 * Created by Radha Singh on 5/26/2018.
 */
public class SimpleTest {

    public static Calculation calculation;
    private Method method;
    private static String METHOD_NAME = "mulNumbers";
    private Class[] parameterTypes;
    private Object[] parameters;

    @Before
    public void setUp() throws NoSuchMethodException{
        calculation = new Calculation();
        parameterTypes = new Class[2];
        parameterTypes[0] = java.lang.Integer.class;
        parameterTypes[1] = java.lang.Integer.class;
        method = calculation.getClass().getDeclaredMethod(METHOD_NAME, parameterTypes);
        method.setAccessible(true);
        parameters = new Object[2];
    }

    @Test
    public void mulNumberTest() throws Exception{
        parameters[0] = 10;
        parameters[1] = 20;
        assertEquals("Error in mulNumberTest ",(Integer)200,method.invoke(calculation,parameters));
    }

    @Test
    public void test(){
        int a = 10;
        int b = 20;

        // assertEquals
        assertEquals("Error",30,a+b);
        assertEquals("Error",-10,a-b);
        assertEquals("Error",200,a*b);
        assertEquals("Error",0,a/b);
    }

    @Test
    public void addNumbersTest(){
        assertEquals("Error in addNumbersTest",(Integer) 20, Calculation.addNumbers(10,10));
    }

    @Test
    public void subNumbersTeat(){
        Calculation calculation = new Calculation();
        assertEquals("Error in subNumbersTest",(Integer)10,calculation.subNumbers(20,10));
    }

    @Test
    public void divNumberTest(){
        assertEquals("Error in divNumberTest",(Integer) 2,calculation.divNumbers(20,10));
    }



}