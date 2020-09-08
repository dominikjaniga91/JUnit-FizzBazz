import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    // https://codingdojo.org/kata/FizzBuzz

    public List<String> getListOfNumbers() {
        return IntStream.rangeClosed(0, 100).mapToObj(this::getFizzBuzz).collect(Collectors.toList());
    }

    private String getFizzBuzz(int number){

            if(number % 5 == 0 && number % 3 == 0){
               return "FizzBuzz";
            }else if( number % 5 == 0 || ifContains5(number)) {
                return "Buzz";
            }else if(number % 3 == 0 || ifContains3(number)){
                return "Fizz";
            }else{
                return String.valueOf(number);
            }

    }

    private boolean ifContains3(int number){
        return String.valueOf(number).contains("3");
    }

    private boolean ifContains5(int number){
        return String.valueOf(number).contains("5");
    }

}
