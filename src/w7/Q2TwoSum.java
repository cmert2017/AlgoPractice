package w7;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q2TwoSum {
    //Given an array of integers nums and an integer target, return the two numbers such that they add up to target.
    //Assume that each input would have exactly one solution, and you should not use the same element twice.
    //You can return the answer in any order.
    //No solution will return empty array.
    //Please, use two pointer strategy to solve this problem (Hint : you should sort the input first).
    //Example:
    //Input: nums = [2, 3, 11, 5, 15], target = 8
    //Output: [3, 5]
    //Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
    //Optional additional task: Try to return original indices of the pair numbers.
    //Please, try to find more efficient solution after solving second algo question using two pointer strategy.


    public static int[] twoSum(int[] arr, int target){

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        
        for (Map.Entry<Integer, Integer> arrValue : map.entrySet()) {
            int possibleMatch = target - arrValue.getKey();
            if(map.containsKey(possibleMatch)) return new int[] {arrValue.getKey(), possibleMatch};
        }

        return  new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {16, 3, 11, 5, 15};
        int target = 8;
        System.out.println("twoSum(arr) = " + Arrays.toString(twoSum(arr,target)));

    }

    
}
