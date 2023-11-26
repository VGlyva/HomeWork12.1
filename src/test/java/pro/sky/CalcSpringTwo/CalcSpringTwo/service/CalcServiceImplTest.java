package pro.sky.CalcSpringTwo.CalcSpringTwo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceImplTest {
    private final CalcService calcService = new CalcServiceImpl();

    public static Stream<Arguments> positiveMinus() {
        return Stream.of(
                Arguments.of(3, 2, 1),
                Arguments.of(-2, 1, -3)
        );
    }

    @Test
    void helloCalculator() {
        String expected = "Добро пожаловать в калькулятор";
        assertEquals(expected, calcService.helloCalculator());

    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "-10,2,-8"})
    void plusCalc(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calcService.plusCalc(a, b));
    }

    @ParameterizedTest
    @MethodSource("positiveMinus")
    void minusCalc(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calcService.minusCalc(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,2", "-11,2,-22"})
    void multiply(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calcService.multiply(a, b));
    }

    @Test
    void dividePositive() {
        double expected = 1;
        assertEquals(expected, calcService.divide(5, 5));
    }

    @Test
    void divideNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> calcService.divide(2, 0));
    }
}