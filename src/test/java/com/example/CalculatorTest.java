package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println("Running testAdd: 2 + 3 = " + result);
        assertEquals(5, result);
    }
    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(3, 2);
        System.out.println("Running testSubtract: 3 - 2 = " + result);
        assertEquals(1, result);
    }
}
