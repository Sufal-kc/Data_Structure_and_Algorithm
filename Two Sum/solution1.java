// using native approach
/* -checking all possible pair of numbers in the array and checking if they add up to the target value
   -time complexity: O(n^2)
   -space complexity: O(1)
 */
// import java.util.Arrays;

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
