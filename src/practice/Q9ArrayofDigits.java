package practice;

import java.util.Arrays;

public class Q9ArrayofDigits {
    //How to convert a positive int to an array of digits.
    //Input: 490 Output: [4, 9, 0] (as int Array)


    public static int[] arrayOfDigits(int num){
        String[] arrString = String.valueOf(num).split("");
        int[] resultAr = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            resultAr[i]=Integer.parseInt(arrString[i]);
        }

        return resultAr;
    }


    public static void main(String[] args) {
        int num = 49098766;

        System.out.println("arrayOfDigits(input) = " + Arrays.toString(arrayOfDigits(num)));

    }

}
