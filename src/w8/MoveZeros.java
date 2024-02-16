package w8;

import java.util.Arrays;

public class MoveZeros {
    //Question-1 Move Zeroes
    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero
    //elements.
    //Note that you must do this in-place without making a copy of the array.
    //Example 1:
    //Input: nums = [0, 1, 0, 3, 12] Output: [1, 3, 12, 0, 0]
    //Example 2:
    //Input: nums = [0] Output: [0]
    //Constraints:
    //• 1 <= nums.length <= 104
    //• -231 <= nums[i] <= 231 - 1


    public static int[] moveZeros(int[] nums){





        return nums;
    }




    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};

        System.out.println("Arrays.toString(moveZeros(nums)) = " + Arrays.toString(moveZeros(nums)));


    }
}
