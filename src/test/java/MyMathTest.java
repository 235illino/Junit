import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldExeption() {
        MyMath.divide(2, 0);

    }
}
