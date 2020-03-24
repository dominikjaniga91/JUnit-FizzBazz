import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {



    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    @DisplayName("Should return 1 when getting first number of list")
    void shouldReturnFirstNumberOfTableEquals1(){

        assertThat(fizzBuzz.getListOfNumbers().get(1)).isEqualTo("1");
    }

    @Test
    @DisplayName("Should return 101 when getting size od the list")
    void shouldReturnSizeOfListEquals100(){

        assertThat(fizzBuzz.getListOfNumbers().size()).isEqualTo(101);
    }

    @ParameterizedTest(name = "Number {0} should return Fizz")
    @ValueSource(ints = {3,6,9,12,18,21,24,27,33})
    @DisplayName("Should return Fizz when number is divisible by 3")
    void shouldReturnFizz_whenNumberIsDivisibleBy3(int numbers){

        assertThat(fizzBuzz.getListOfNumbers().get(numbers)).isEqualTo("Fizz");
    }

    @ParameterizedTest(name = "Number {0} should return Buzz")
    @ValueSource(ints = {5,10,20,25,35,40,50,55})
    @DisplayName("Should return Buzz when number is divisible by 5")
    void shouldReturnBuzz_whenNumberIsDivisibleBy5(int number){

        assertThat(fizzBuzz.getListOfNumbers().get(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest(name = "Number {0} should return FizzBuzz")
    @ValueSource(ints = {15,30,45,60,75})
    @DisplayName("Should return FizzBuzz when number is divisible by 3 and 5")
    void shouldReturnFizzBuzz_whenNumberIsDivisibleBy3And5(int number){

        assertThat(fizzBuzz.getListOfNumbers().get(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest(name = "Number {0} should return Fizz")
    @ValueSource(ints = {13,23,43})
    @DisplayName("Should return fizz when number contains 3")
    void shouldReturnFizz_whenNumberContains3(int number) {

        assertThat(fizzBuzz.getListOfNumbers().get(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest(name = "Number {0} should return Buzz")
    @ValueSource(ints = {51,52,54,56})
    @DisplayName("Should return buzz when number contains 5")
    void shouldReturnBuzz_whenNumberContains5(int number) {

        assertThat(fizzBuzz.getListOfNumbers().get(number)).isEqualTo("Buzz");
    }
}
