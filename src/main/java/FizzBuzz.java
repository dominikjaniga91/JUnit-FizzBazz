import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    List<String> listOfNumbers = new ArrayList<>();


    public List<String> getListOfNumbers() {
        add100NumbersToList(listOfNumbers);
        return listOfNumbers;
    }

    private void add100NumbersToList(List<String> listOfNumbers){

        for (int i = 0; i <= 100; i++) {
            if(i % 5 == 0 && i % 3 == 0){
                listOfNumbers.add("FizzBuzz");
            }else if( i % 5 == 0) {
                listOfNumbers.add("Buzz");
            }else if(i % 3 == 0 || ifContains3(i)){
                listOfNumbers.add("Fizz");
            }else{
                listOfNumbers.add(String.valueOf(i));
            }
        }
    }

    private boolean ifContains3(int number){

        return String.valueOf(number).contains("3");
    }

}
