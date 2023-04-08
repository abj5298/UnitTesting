import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitJupiterTestCalc
{
    private final Calculate calc = new Calculate();

     @Test
        void subtraction1() {assertEquals(0.0, calc.sub(1.0, 1.0));}
        @Test
        void addition2() {assertEquals(2.0, calc.add(1.0, 1.0));}
    @Test
    void Multiplication3() {assertEquals(1.0, calc.mul(1.0, 1.0));}
    @Test
    void Division4() {assertEquals(2.0, calc.div(10.0, 5.0));}
    }

