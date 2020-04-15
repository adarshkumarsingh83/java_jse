import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Radha Singh on 5/27/2018.
 * @BeforeClass
 * @AfterClass
 * @Test
 */
public class TestClassTwo {
    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("beforeClassTest");
    }

    @Test
    public void testOne(){
        System.out.println("test One");
    }

    @Test
    public void testTwo(){

        System.out.println("test two");
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("after class test");
    }

    @AfterClass
    public static void afterClassTestOne(){
        System.out.println("after class test ONE");
    }

}