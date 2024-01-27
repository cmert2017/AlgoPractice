package practice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Q8FrequencyofArrayElements {
    //Write a function that takes a String array as parameter and returns a map object that
    //contains each element of array as key and their occurrence counts as value.
    //For calculating occurrence, array elements should be checked by regarding case sensitivity.
    //Order is not important.
    //EXAMPLE:
    //Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
    //Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}



    public static Map<String, Integer> frequencyofArrayElements(String[] arr){

        Map<String, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if(frequencies.containsKey(arr[i].toLowerCase(Locale.ROOT))){
                frequencies.put(arr[i], frequencies.get(arr[i])+1);
            }else{
                frequencies.put(arr[i],1);
            }

        }
        return frequencies;

    }


    public static void main(String[] args) {

        String[] arr = {"apple","APple", "cherry","banana"};

        System.out.println("frequencyofArrayElements(arr) = " + frequencyofArrayElements(arr));


    }


}
