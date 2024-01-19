package practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Q5 {


//Question-1 Find Max from int Array
//Write a function that can find the maximum number from an int Array.
//input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
        public static OptionalInt max_stream(int[] arr){

            return Arrays.stream(arr).max();
        }

        public static String max_loop(int[] arr){


            if (arr.length == 0) return "The array is empty. There is no max";

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }


             return String.valueOf(max);
        }





        public static String max_arrays(int[] arr){

            if (arr.length == 0) return "The array is empty. There is no max";

            Arrays.sort(arr);

            return String.valueOf(arr[arr.length -1]);
        }







    public static void main(String[] args) {  //main() function is the entry point for java project

            int[] arr1={3,4,8,10};
            int[] arr2={-3,-4,-8,-10};
            int[] arr3={};

        System.out.print(max_stream(arr1)+ " or basically it is ");
        System.out.println(max_stream(arr1).getAsInt());
        System.out.print(max_stream(arr2)+ " or basically it is ");
        System.out.println(max_stream(arr2).getAsInt());
        System.out.println(max_stream(arr3));
        System.out.println("*******************");
        System.out.println(max_loop(arr1));
        System.out.println(max_loop(arr2));
        System.out.println(max_loop(arr3));
        System.out.println("*******************");
        System.out.println(max_arrays(arr1));
        System.out.println(max_arrays(arr2));
        System.out.println(max_arrays(arr3));


    }

}
