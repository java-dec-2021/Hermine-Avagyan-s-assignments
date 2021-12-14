public class FizzBuzz {
    public String fizzBuzz(int number) {
        //if divisable by 3 and 5
        if (number% 3 == 0 && number % 5 == 0){
            return "Fizzbuzz";
        }
        //if divisable by 3
        else if (number % 3 == 0){
            return "Fizz";
        }
        //if divisable by 5
        else if (number % 5 == 0){
            return "Buzz";
        }
        else {
            return String.valueOf(number);
        }

    }
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(
            // Parameters
            int number,
            String multOf3Word,
            String multOf5Word,
            String multOf15Word
    ) {
        if (number % 3 == 0 && number % 5 == 0) {
            return multOf15Word;
        } else if (number % 3 == 0) {
            return multOf3Word;
        } else if (number % 5 == 0)
            return multOf5Word;
        else {
            return String.valueOf(number);
        }
    }

    }

