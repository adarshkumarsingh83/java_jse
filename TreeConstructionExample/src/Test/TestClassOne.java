import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Radha Singh on 5/27/2018.
 * we can have multiple before/after methods in single test class
 */
public class TestClassOne {
    @Before
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void testOne(){
        System.out.println("testOne");
    }

    @Test
    public void testTwo(){
        System.out.println("testTwo");
    }

    @Before
    public void beforeTest1(){
        System.out.println("before test 1");
    }

    @After
    public void afterTest1(){
        System.out.println("after Test 1");
    }

    @After
    public void afterTest2(){
        System.out.println("after test 2");
    }
}
