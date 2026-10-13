// Using Binary Search - O(log(n)) Time and O(1) Space 
class Solution2 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <=x){
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
    }
    return result;
    }
}



public class Soln2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int x = 8;
        int result = s.mySqrt(x);
        System.out.println("Result: " + result);
    }
  
}
