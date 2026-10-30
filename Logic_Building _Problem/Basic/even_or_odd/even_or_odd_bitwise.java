// package Logic_Building _Problem.Basic.even_or_odd;
// import Java.util.Scanner;
import java.util.Scanner;


public class even_or_odd_bitwise {
    public static boolean Checker(int num){
        if ((num & 1)==0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to be checked :");
        int n = scanner.nextInt();

        System.out.print("True-> even, False-> odd "+Checker(n));

        scanner.close();
    }
}

// 15  ->               1 1 1 1
//                     &  0 0 0 1
//                        -------
//                        0 0 0 1 , so this we can say it is an odd number