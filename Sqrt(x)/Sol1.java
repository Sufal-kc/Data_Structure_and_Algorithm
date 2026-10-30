// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

//     For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.

// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

 class Solution1 {
    public int mySqrt(int x) {
        int n =1;
        while ((long) n * n <= x){       //using long to avoid integer overflow, making square smaller than the x       
        long sqr = (long)n*n;
            if (x ==sqr){
                return n;
                // break;
            }
            n ++;
        }
        System.out.println("The square root of " + x + " is " + n);
        return n-1;
    }
 }

public class Sol1{
    public static void main(String[] args){
        Solution1 s = new Solution1();
        int x = 8;
        int result = s.mySqrt(x);
        System.out.println("Result: " + result);
    }
}
// [Naive Approach] Using a loop - O(sqrt(n)) Time and O(1) Space
//in simpler approach
//public int mySqrt(int x) {
//        int n = 1;
//       while  (n*n <= x){
//            n++;
//        }
//        return n-1;
    