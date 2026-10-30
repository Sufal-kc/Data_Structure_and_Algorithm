// using native approach
/* -checking all possible pair of numbers in the array and checking if they add up to the target value
   -time complexity: O(n^2)
   -space complexity: O(1)
 */
// import java.util.Arrays;
// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9

// Output: [0,1]

// Explanation:

// The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1] are returned.

// Example 2:

// Input: nums = [3,2,4], target = 6

// Output: [1,2]

// Explanation:

// The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2] are returned.

// Example 3:

// Input: nums = [3,3], target = 6

// Output: [0,1]

// Explanation:

// The sum of nums[0] and nums[1] is 3 + 3 = 6, which equals the target. Therefore, the indices [0, 1] are returned.

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // int[] numbers = new int[2];
        for (int i =0 ; i < n; i++){
            for (int j= i+1; j < n; j++){
                if ((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                } 
                }
            }
        return new int[]{};
    }

 public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        Solution1 solution = new Solution1();
        int[] result = solution.twoSum(arr, target);

        if (result.length == 0) {
            System.out.println("No such pair exists");
        } else {
            // int[] result = twoSum(arr, target)
            System.out.println("Pair found at index: " + result[0] + " and " + result[1]);
        }
        
}
}
