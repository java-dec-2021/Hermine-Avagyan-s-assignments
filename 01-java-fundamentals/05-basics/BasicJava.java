import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    //this method prints all the numbers from 1 to 255.
    public void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    //this method prints all the odd numbers from 1 to 255.
    public void printOddNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //the method returns the sum of all the numbers from 1 to 255
    public int sigma(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    //Given an array X,prints each value on the screen
   public void iterateArray(int[] x){

       for (int i = 0; i <=x.length-1; i++) {
           System.out.println(x[i]);
       }
    }

    //this method takes an array and prints the maximum value in it
    public void printMax(int[] array){
        int max = array[0];
        for (int i = 1; i< array.length; i++){
            if (array[i]> max){
                max = array[i];
            }

        }
        System.out.println(max);
    }
    //the method prints an array of odd numbers within the given range
    public void arrayWithOddNumbers(int start, int end){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = start; i<= end; i++){
            if (i % 2 != 0){
                myArray.add(i);
            }
        }
        System.out.println(myArray);

    }
    //the method takes an array, and prints the AVERAGE of the values in the array.
    public void getAverage(int[] array){
        int sum = 0;
        int size = array.length;

        for (int i = 0; i <= array.length-1; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("the average is " + sum/size);
    }

    // this method returns the count of numbers in a given array greater than a given number
    public int greaterThan(int[] array, int y){
        int count = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if(array[i] > y){
                count ++;
            }
        }
        return count;
    }
    // this method multiplies each value in a given array by itself.
    public void squareValues(int[] array) {
        //create a new array of the size of the given array
        int[] squared = new int[array.length];

        for (int i = 0; i <= array.length-1; i++) {
            squared[i] = array[i] * array[i];

        }
        System.out.println(Arrays.toString(squared));
    }

    //Given an array this method replaces any negative number with the value of 0.
    public void eliminateNegative(int[] x){
        int[] newArray = new int[x.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = x[i];
            if(x[i] < 0){
                newArray[i] = 0;
        }
        }
        System.out.println(Arrays.toString(newArray));
    }
   //this method returns an array with the max, min and average of a given array.
    public ArrayList<Integer> returnArrayInfo(int[] array){
        ArrayList<Integer> newArray = new ArrayList();
        int min = array[0];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
            sum += array[i];
        }
        int average = sum/array.length;

        newArray.add(max);
        newArray.add(min);
        newArray.add(average);
        return newArray;

    }

// method shifts each number of a given array by one to the front and the last number is 0.
// eg [1, 5, 10, 7, -2] will become [5, 10, 7, -2, 0].
    public int[] shiftingValues(int[] x){
        for (int k = 0; k < x.length-1; k++) {
            x[k] = x[k + 1];
    }
        x[x.length-1] = 0;

    return x;
}}

