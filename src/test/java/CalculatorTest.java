import org.example.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() {
        System.out.println("Initializare obiect calculator");
        calculator = new Calculator();
    }

    @AfterEach
    public void dislayMessage () {
        System.out.println("Acest mesaj apare dupa fiecare test.");
    }

   @Test
    public void sunaTest() {
        // given ( ce se da)
        int a = 2;
        int b = 3;

        // when  (cand)
        int result = calculator.suma(a,b);

        // then (atunci)
        assertEquals(5, result);
        assertNotEquals(10,result);

    }
    @Test
    public void scadeteTest() {

        // given
        int a = 5;
        int b = 3;

        // when
        int result = calculator.scadere(a,b);

        // then
        assertEquals(2, result);
    }
    @Test
    public void inmultireTest() {

        //given
        int a = 4;
        int b = 6;

        //when
        int result = calculator.inmultire(a,b);

        //then
        assertEquals(24, result);

    }

    @Test
    public void impartireTest() {

        //given
        int a = 12;
        int b = 3;

        //when
        double result = calculator.impartire(a,b);

        //then
        assertEquals(4, result);

    }
}
