package w6;

import java.util.*;

public class Q1ValidAnagram {

    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    //typically using all the original letters exactly once.
    //Constraints:
    //1 <= s.length, t.length <= 5 * 104
    //s and t consist of lowercase English letters.
    //Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
    //such a case?
    //Example 1:
    //Input: s = "anagram", t = "nagaram"
    //Output: true
    //Example 2:
    //Input: s = "rat", t = "car"
    //Output: false
    //Please, test your solution here : https://leetcode.com/problems/valid-anagram/


    public static boolean isAnagram(String s, String t){
        //Runtime: 68 ms Beats 5.06% of users with Java
        //Memory: 55.14 MB Beats 5.37% of users with Java
        if (s.length()!=t.length()) return false;

        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }


    public static boolean isAnagram2(String str1, String str2){
        //724 ms Beats 5.06% of users with Java
        //50.00 MB Beats 5.37% of users with Java

        if (str1.length()!=str2.length()) return false;

        List<String> str1List = new ArrayList<>();
        str1List.addAll(Arrays.asList(str1.split("")));
        System.out.println("str1List = " + str1List);

        for (int i = 0; i < str2.length(); i++) {
            if(str1List.contains(str2.charAt(i)+"")){
               str1List.remove(str2.charAt(i)+"");
               System.out.println("str1List = " + str1List);
            }else{
                return false;
            }
        }

        return true;

    }

    public static boolean isAnagram_hashmap(String s, String t){

        //33 ms Beats 5.06% of users with Java
        //45.63 MB Beats 5.37% of users with Java

        if (s.length()!=t.length()) return false;

        HashMap<String,Integer> sHashMap = new HashMap<>();  // space compl -> O(n)

        for (int i = 0; i < s.length(); i++) {   // O(n)

            if(sHashMap.containsKey(s.charAt(i)+"")) // 0(1 *n)
                sHashMap.put(s.charAt(i)+"",sHashMap.get(s.charAt(i)+"")+1); // o(1 * n)
            else sHashMap.put(s.charAt(i)+"",1) ;

        }



        System.out.println("sHashMap = " + sHashMap);

        for (int i = 0; i < t.length(); i++) {  //O(n)
            if(sHashMap.containsKey(t.charAt(i)+"")) {  // O(n)
                sHashMap.put(t.charAt(i) + "", sHashMap.get(t.charAt(i) + "")-1); // O(n)
                if(sHashMap.get(t.charAt(i)+"")==0) // O(n)
                    sHashMap.remove(t.charAt(i) + "");
            }
            else return false;
        }

        // total time complexity so far = O(n)+ O(n)+ O(n) + O(n)+ O(n)+ O(n) = 6 * O(n) ---> O(n)

        return true;

    }




    public static boolean isAnagram_hashmap2(String s, String t) {

        // Creating a Map to store letter frequencies
        Map<Character, Integer> sHashMap = new HashMap<>();

        // Iterating through each character in the input string
        for (char c : s.toCharArray()) {
            // Using getOrDefault to update the frequency count
            sHashMap.put(c, sHashMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("sHashMap = " + sHashMap);

        for (int i = 0; i < t.length(); i++) {
            if(sHashMap.containsKey(t.charAt(i))) {
                sHashMap.put(t.charAt(i), sHashMap.get(t.charAt(i))-1);
                if(sHashMap.get(t.charAt(i))==0)
                    sHashMap.remove(t.charAt(i));
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 =  "aaccc";
        String str2 =  "ccaca";

//        System.out.println("isAnagram(str1,str2) = " + isAnagram(str1, str2));
        System.out.println("isAnagram2(str1,str2) = " + isAnagram2(str1, str2));
//          System.out.println("isAnagram_hashmap(str1,str2) = " + isAnagram_hashmap(str1, str2));
//          System.out.println("isAnagram_hashmap2(str1,str2) = " + isAnagram_hashmap2(str1, str2));

    }
}
