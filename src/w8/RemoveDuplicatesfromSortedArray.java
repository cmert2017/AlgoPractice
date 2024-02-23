package w8;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

    //Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
    //unique element appears only once. The relative order of the elements should be kept the same.
    //Since it is impossible to change the length of the array in Java, you must instead have the result be placed in
    //the first part of the array nums. More formally, if there are k elements after removing the duplicates, then
    //the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
    //k elements.
    //Return k after placing the final result in the first k slots of nums.
    //Do not allocate extra space for another array. You must do this by modifying the input array in-place with
    //O(1) extra memory.
    //Example 1:
    //Input: nums = [1, 1, 2] Output: 2, nums = [1, 2,_]
    //Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2
    //respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).
    //Example 2:
    //Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
    //Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4
    //respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).
    //Constraints:
    //1 <= nums.length <= 3 * 104
    //-100 <= nums[i] <= 100
    //nums is sorted in non-decreasing order.


    public static int removeDuplicatesfromSortedArray(int[] nums){

        //5 ms Beats 8.44% of users with Java
        // 44.46 MB Beats 88.33% of users with Java

        Set<Integer> numsNonduplicates = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsNonduplicates.add(nums[i]);
        }

        int i=0;
        for (int temp : numsNonduplicates) {
            nums[i]=temp;
            i++;
        }


        return numsNonduplicates.size();
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        System.out.println("Arrays.toString(removeDuplicatesfromSortedArray(nums)) = " + removeDuplicatesfromSortedArray(nums));

    }
}
