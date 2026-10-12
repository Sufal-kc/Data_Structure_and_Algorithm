import java.util.Arrays;
import java.util.Comparator;

class solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[][] matrix = new int[nums.length][2]; // Creates a grid with 2 rows and 4 columns
        for (int i=0; i< nums.length;i++){
            matrix[i][0] = nums[i];
            matrix[i][1]=i;
        }
        Arrays.sort(matrix, Comparator.comparingInt(a -> a[0]));
        // Arrays.sort(nums); //mostly time complexity nlogn

        // for (int i=0; i< nums.length;i++){
        //     matrix[1][i] = nums[i];
        // }

        int left = 0;
        int right = nums.length -1;

        
        while(left < right){
            // int sum =(nums[left] + nums[right]);
            int sum = matrix[left][0] + matrix[right][0];
            if (sum==target){
                // return new int[]{left,right};/
                return new int[]{matrix[left][1], matrix[right][1]};
                // break;
            } else if(sum > target){
                right--;
            } else{
                left++;
            }
        }
    return new int[]{};
    }

public static void main(String[] args){

    int[] arr = { 0, -1, 2, -3, 1 };
    int target = -2;

    solution2 solution = new solution2();
    int[] result = solution.twoSum(arr, target);

    if (result.length == 0) {
        System.out.println("No such pair exists");
    } else {
        // int[] result = twoSum(arr, target)
        System.out.println("Pair found at index: " + result[0] + " and " + result[1]);
    }
    
}

}