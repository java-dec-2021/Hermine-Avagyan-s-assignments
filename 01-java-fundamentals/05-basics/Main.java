import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BasicJava bj = new BasicJava();
//        bj.printNumbers(1,5);
//        System.out.println("--------------------------");
//        bj.printOddNumbers(1,10);
//        System.out.println("--------------------------");
//        System.out.println(bj.sigma(1,5));
//        System.out.println("--------------------------");
//        int[] array =  {-2,10,10};
    int[] newArray = {1, -3, 5, -7, 10, -123,  2};
//        bj.iterateArray(array);
//        System.out.println("The max is ");
//        bj.printMax(array);
//        System.out.println();
//        bj.arrayWithOddNumbers(1,255);
//        bj.getAverage(array);
//        System.out.println(bj.greaterThan(newArray, 1));
        bj.squareValues(newArray);
         // bj.eliminateNegative(newArray);
        int[] arr = {1, 5, 10, 7, -2};

        System.out.println(bj.returnArrayInfo(arr));

        //System.out.println (Arrays.toString(bj.shiftingValues(arr)));





}}
