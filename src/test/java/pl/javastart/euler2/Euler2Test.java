package pl.javastart.euler2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Euler2Test {
    @DisplayName("Should return 10 for limit 10")
    @Test
    public void shouldReturn10ForLimit10() {
        //when
        int method = Euler2.calculateTheSumOfTheFibonacciSequence(10);
        //then
        Assertions.assertEquals(10, method);
    }

    @DisplayName("Should return 44 for limit 33")
    @Test
    public void shouldReturn44ForLimit34() {
        //when
        int method = Euler2.calculateTheSumOfTheFibonacciSequence(34);
        //then
        Assertions.assertEquals(44, method);
    }

    @DisplayName("Should return 4_613_732 for limit 4_000_000")
    @Test
    public void shouldReturn4_613_732ForLimit4_000_000() {
        //when
        int method = Euler2.calculateTheSumOfTheFibonacciSequence(4_000_000);
        //then
        Assertions.assertEquals(4_613_732, method);
    }
}