import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    //method generates and returns an array of 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls(int low, int high){
        Random random = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(int i = low; i <=10; i++){
            int randomNum = random.nextInt(high-low +1) + low;
            myArray.add(randomNum);
        }
        return myArray;
    }
//method creates an array that contains all 26 letters of the alphabet.
//Generates a random index between 0-25, and uses it to pull a random letter out of the array. 
//Returns the random letter.
    public char randomLetter(){
        Random random = new Random();
        char[] alphabet = new char[26];
        for (int i = 0; i< alphabet.length; i++){
            alphabet[i] = (char)(97 + i);
        }
        int randomNum = random.nextInt(26);

        return alphabet[randomNum];
    }

    //method uses the previous method to create a random string of eight characters, and returns that string.
    public String generatePassword(){
        String password = "";
        for (int i = 0; i< 8; i++){
            char letter = randomLetter();
            password += letter;
        }

        return password;
}

//the method takes an int length as an argument and creates
//an array of random eight character words.
    public ArrayList<String> getNewPasswordSet(int num){
        ArrayList<String> randomStrings = new ArrayList<String>();
        for (int i = 0; i< num; i++){
            randomStrings.add(generatePassword());
        }
       return randomStrings;
    }

    /*shuffleArray
the method takes an array and and mixes up all the values in a pseudo-random way.
it uses random indexes within the array, and swaps values repeatedly. */
    public String shuffleArray(int[] arr){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            int j = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return Arrays.toString(arr);
    }
}
