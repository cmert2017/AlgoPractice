package week12;

import java.util.Arrays;

public class PlusOne {

    //Plus One
    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
    //integer. The digits are ordered from most significant to least significant in left-to-right order. The large
    //integer does not contain any leading 0's.
    //Increment the large integer by one and return the resulting array of digits.
    //Example 1:
    //Input: digits = [1,2,3] Output: [1,2,4]
    //Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result
    //should be [1,2,4].
    //Example 2:
    //Input: digits = [4,3,2,1] Output: [4,3,2,2]
    //Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the
    //result should be [4,3,2,2].

    //Input: digits = [9] Output: [1,0]
    //Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the result should
    //be [1,0].
    //Constraints:
    //1 <= digits.length <= 100
    //0 <= digits[i] <= 9
    //digits does not contain any leading 0's.
    //Please, try to test your solution via JUnit and also test your solution here:
    //https://leetcode.com/problems/plus-one/


    public static int[] plusOne(int[] digits) {
        //0 ms Beats 100.00% of users with Java
        //41.52 MB Beats 80.95% of users with Java

        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }else {
                int counter9=0;
                for (int i = digits.length-1 ; i >= 0 ; i--) {
                    if(digits[i]==9){
                        counter9++;
                    }else if (counter9 > 0){
                        break;
                    }
                }
            if(counter9 == digits.length){
                    int[]  newDigits = new int[digits.length+1];
                    newDigits[0]=1;
                    for (int i = 1; i < digits.length+1; i++) {
                        newDigits[i]=0;
                    }
                    return newDigits;
                }else{
                    for (int i = 0 ; i < counter9; i++) {
                        digits[digits.length - 1 -i]=0;
                    }
                    digits[digits.length - 1 - counter9 ] ++;
                }
        }
        return digits;
    }



    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] digits2 = {1,2,9};
        int[] digits3 = {1,9,9,9};
        int[] digits4 = {9,9,9,9};
        int[] digits5 = {9,8,9,9};
        int[] digits6 = {9};

//        System.out.println("plusOne(digits1) = " + Arrays.toString(plusOne(digits1)));
//        System.out.println("plusOne(digits2) = " + Arrays.toString(plusOne(digits2)));
//        System.out.println("plusOne(digits3) = " + Arrays.toString(plusOne(digits3)));
//        System.out.println("plusOne(digits4) = " + Arrays.toString(plusOne(digits4)));
//        System.out.println("plusOne(digits5) = " + Arrays.toString(plusOne(digits5)));
        System.out.println("plusOne(digits6) = " + Arrays.toString(plusOne(digits6)));


    }

}
