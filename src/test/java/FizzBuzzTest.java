import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {



    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFirstNumberOfTableEquals1(){

        assertThat(fizzBuzz.getListOfNumbers().get(0)).isEqualTo("1");
    }

    @Test
    void shouldReturnSizeOfListEquals100(){

        assertThat(fizzBuzz.getListOfNumbers().size()).isEqualTo(100);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9,12,18,21,24,27,33})
    void shouldReturnFizz_whenElementOfListIsDivisibleBy3(int numbers){

        assertThat(fizzBuzz.getListOfNumbers().get(numbers-1)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5,10,20,25,35,40,50,55})
    void shouldReturnBuzz_whenElementOfListIsDivisibleBy5(int number){

        assertThat(fizzBuzz.getListOfNumbers().get(number-1)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15,30,45,60,75})
    void shouldReturnFizzBuzz_whenElementOfListIsDivisibleBy3And5(int number){

        assertThat(fizzBuzz.getListOfNumbers().get(number-1)).isEqualTo("FizzBuzz");
    }
}
