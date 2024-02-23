package week9;

public class LengthOfLastWord {

    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    // A word is a maximal substring consisting of non-space characters only.
    // Example 1: Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with length 5.
    // Example 2: Input: s = " fly me to the moon " Output: 4 Explanation: The last word is "moon" with length 4.
    // Example 3: Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is "joyboy" with length 6.

    // Constraints:
    // 1 <= s.length <= 104 s consists of only English letters and spaces ' '.
    // There will be at least one word in s.

    //Please, test your solution here: https://leetcode.com/problems/length-of-last-word/



    public static int lengthOfLastWord(String s){
        //0 ms Beats 100.00% of users with Java
        //41.54 MB Beats 69.00% of users with Java
        s = s.trim();
        int counter=0;
        if (s.length()==1) return 1;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)==' '){
                return counter;
            }
            counter++;

        }

        return counter;
    }


    public static void main(String[] args) {

        String s1 = " fly me to the moon ";
        String s2 = "luffy is still joyboy";
        String s3 = "    day";

//        System.out.println("lengthOfLastWord(s1) = " + lengthOfLastWord(s1));
//        System.out.println("lengthOfLastWord(s2) = " + lengthOfLastWord(s2));
        System.out.println("lengthOfLastWord(s3) = " + lengthOfLastWord(s3));

    }


}
