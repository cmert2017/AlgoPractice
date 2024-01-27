package w6;

public class Q2ValidPalindrome {
    //Write a function that accepts a string and determines whether it is a palindrome, ignoring non-alphanumeric
    //characters and case and returns true if it is palindrome.
    //(A string is said to be palindrome if it reads the same backward as forward, after converting all
    //uppercase letters into lowercase letters and removing all non-alphanumeric characters).
    //Examples:
    //Input: Do geese see God? Output: True
    //Input: Was it a car or a cat I saw? Output: True
    //Input: A brown fox jumping over Output: False
    //Constraints:
    //• 1 <= s.length <= 2 * 105
    //• s consists only of printable ASCII characters.
    //Please, test your solution here : https://leetcode.com/problems/valid-palindrome/


    public static boolean validPalindrome(String s){

        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-zA-z]","");
        System.out.println("s = " + s);
        for (int i = 0; i < s.length()/2; i++) {

            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args) {

//        String s = "Was it a car or a cat I saw";
//        String s = "aba aba";
        //String s = "A man, a plan, a canal: Panama";
        String s = "ab_a";

        System.out.println("validPalindrome(s) = " + validPalindrome(s));


    }

}
