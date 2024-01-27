package practice;

import java.util.HashSet;
import java.util.Set;

public class Q7FirstUniqueCharacter {

    //Write a function that returns the first non-repeated character from a string.
    //If all characters are repeated return a space character.
    //EXAMPLE:
    //Input: "success" output: u
    //Explanation: u and e are non-repeated, u is the first non-repeated character


    public static String firstUniqueChar_loopTODO(String str){
        String result =" ";
        for (int i = 0; i < str.length(); i++) {
            int counter=0;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }

            }
            if (counter==0){
                return str.charAt(i)+"";
            }
        }
        return result;
    }


    public static String firstUniqueChar_set(String str){
        String result =" ";

        for (int i = 0; i < str.length(); i++) {
            Set<String> strChars = new HashSet<>();
            int counter=0;
            for (int j = i+1; j < str.length(); j++) {
                if(!strChars.contains(str.charAt(i))){
                    strChars.add(str.charAt(i)+"");
                    counter++;
                }
            }
            if(counter==1){
                return str.charAt(i)+"";
            }

        }

        return result;
    }

    public static void main(String[] args) {

        String input1="successut";

//        System.out.println("firstUniqueChar(input1) = " + firstUniqueChar_loopTODO(input1));
        System.out.println("firstUniqueChar_set(input1) = " + firstUniqueChar_set(input1));
    }


}
