package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q3CountthenumberofDuplicatedChars {

//Write a function that will return the count of distinct case-insensitive alphabetic characters
//and numeric digits that occur more than once in the input string.
//The input string can be assumed to contain only alphabets (both uppercase and lowercase)
//and numeric digits.
//Example:
//"abcde" -> 0 # no characters repeats more than once.
//"aabbcde" -> 2 # 'a' and 'b'
//"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//"indivisibility" -> 1 # 'i' occurs six times.
//"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
//"aA11" -> 2 # 'a' and '1'
//"ABBA" -> 2 # 'A' and 'B' each occur twice.


    public static int CountTheNumberOfDuplicatedChars_loop(String input){
        input = input.toLowerCase();

        Set<Character> charactersNonRepeating = new HashSet<>();
        Set<Character> charactersRepeating = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {  //aabbbbbbbbbcde
            if(!charactersNonRepeating.contains(input.charAt(i))){  //aabbbbbbbbbcde
                charactersNonRepeating.add(input.charAt(i));
            }else{
                charactersRepeating.add(input.charAt(i));
            }
        }

        return charactersRepeating.size();
    }



    public static long CountTheNumberOfDuplicatedChars_stream(String input){

        String[] characters1 = input.split("");

        long countOfDistinct = Arrays.stream(characters1).distinct().count();

        return input.length() - countOfDistinct;
    }

    public static void main(String[] args) {

//        String input = "Aabbcdecccccaaabbbbd";
        String input = "Indivisibilities";

        System.out.println(CountTheNumberOfDuplicatedChars_loop(input));
        //System.out.println(CountTheNumberOfDuplicatedChars_stream(input));



    }

}
