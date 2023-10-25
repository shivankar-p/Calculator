import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() { calculator = new Main();}

    @Test
    public void test_add_positive(){
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b), 0);
    }
    @Test
    public void test_add_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }


    @Test
    public void test_sub_positive(){
        int a = 1;
        int b = 2;
        int expectedResult = -1;
        Assert.assertEquals(expectedResult, calculator.sub(a, b), 0);
    }
    @Test
    public void test_sub_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    }


    @Test
    public void test_mult_positive(){
        int a = 1;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.mult(a, b), 0);
    }
    @Test
    public void test_mult_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.mult(a, b));
    }


    @Test
    public void test_div_positive(){
        int a = 1;
        int b = 2;
        double expectedResult = 0.5;
        Assert.assertEquals(expectedResult, calculator.div(a, b), 0);
    }
    @Test
    public void test_div_negative(){
        int a = 1;
        int b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
}
