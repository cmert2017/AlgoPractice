package AlgoPractice;

import java.util.HashMap;

public class Q2FirstNonRepeatingVowel {

//Given a string, write a method to find the first non-repeating vowel
// (a, e, i, o, u) in it and return its index. If it doesn't exist, return -1.
// Assume that all the characters of the String is lowercase.
//( Do not use String class functions other than charAt() and length() )


    // given: amazon --> a,a,o  --->  index: 4
    //given: aba -->   a,a  --->   -1


    //amazon
    //amezon
    //e
    //mnft
    //aamzzzee
    //amazete
    //{empty}


    public static int firstNonRepeatingVowel(String str){
        int index=-1;
        HashMap<Character,Integer> vowels= new HashMap<>();
        char tempChar;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){

                if(!vowels.containsKey(str.charAt(i)))
                    vowels.put(str.charAt(i),i);
                else {
                    //vowels.put(str.charAt(i),vowels.get(str.charAt(i)+1));
                    vowels.put(str.charAt(i),-2);
                }
            }
        }


        for (Character key : vowels.keySet()) {

            if (vowels.get(key)!=-2) {
                index = vowels.get(key);
                return index;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        System.out.println(firstNonRepeatingVowel("google"));

    }



}
