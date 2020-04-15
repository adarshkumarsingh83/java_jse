import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by Radha Singh on 5/28/2018.
 * test with expected attribute
 * try-catch and always fail()
 * @Rule expectedException
 */
public class TestClassThree {

    @Test(expected = ArithmeticException.class)
    public void expectedTest(){
        int i = 1/0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void expectedTestOne(){
        new ArrayList<>().get(0);
    }

    @Test
    public void testDivisionWithException(){
        try{
            int i = 1/0;
            fail();
        }catch(ArithmeticException e){
            assertThat(e.getMessage(), is("/ by zero"));
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyList(){
        try{
            new ArrayList<>().get(0);
            fail();
        }catch(IndexOutOfBoundsException e){
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();






}