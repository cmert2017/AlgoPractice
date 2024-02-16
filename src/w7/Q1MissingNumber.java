package w7;

import java.util.*;

public class Q1MissingNumber {
    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.
    //Example 1:
    //Input: nums = [3, 0, 1]
    //Output: 2
    // 1+2+3 = 3 * 4 /2 = 6
    // 3+0+1= 4
    //result 6 -4 = 2
    //Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3].
    // 2 is the missing number in the range since it does not appear in nums.
    //Example 2:
    //Input: nums = [0, 1]
    //Output: 2
    //Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 2].
    // 2 is the missing number in the range since it does not appear in nums.
    //Example 3:
    //Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
    //Output: 8
    //Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0, 9].
    // 8 is the missing number in the range since it does not appear in nums.

    //Constraints:
    //n == nums.length
    //1 <= n <= 104
    //0 <= nums[i] <= n
    //All the numbers of nums are unique.
    //Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
    //Please, test your solution here: https://leetcode.com/problems/missing-number/

    public static int missingNumber1(int[] intArr){
        //7 ms Beats 9.34% of users with Java

        //46.04 MB Beats 8.52% of users with Java

        int result=-1;
        Map<Integer,Integer> map=new LinkedHashMap<>();


        for (int i = 0; i < intArr.length; i++) {
            //map.put(intArr[i],map.getOrDefault(intArr[i],0)+1);
            map.put(intArr[i],1);

        }
        //[3,0,1]
        // {(3,1),(0,1),(1,1)}

        System.out.println("map = " + map);

        for (int i = 0; i <= intArr.length; i++) {
            if(!map.containsKey(i)) result=i;
        }

        return result;
    }


    public static int missingNumber2(int[] intArr){
        //23 ms Beats 5.02% of users with Java
        //45.90 MB Beats 8.56% of users with Java

        int result=-1;
        Map<Integer,Integer> map=new HashMap<>();


        for (int i = 0; i < intArr.length; i++) {
            map.put(intArr[i],map.getOrDefault(intArr[i],0)+1);
        }

        System.out.println("map = " + map);

        for (int i = 0; i <= intArr.length; i++) {
            if(!map.containsKey(i)) result=i;
        }

        return result;
    }


    public static int missingNumber3(int[] intArr){
        //2 ms Beats 32.95% of users with Java
        //44.88 MB Beats 74.56% of users with Java
        //1+2+3+...+n = n (n+1)/2
        return (intArr.length * (intArr.length + 1 ) / 2 ) - Arrays.stream(intArr).sum();

    }





    public static void main(String[] args) {
//        int[] intArr ={0, 1};
        int[] intArr ={9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("missingNumber1(intArr) = " + missingNumber1(intArr));
        System.out.println("missingNumber2(intArr) = " + missingNumber2(intArr));
    }



}
