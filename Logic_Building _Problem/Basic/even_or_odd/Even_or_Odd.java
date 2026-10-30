// package Logic_Building _Problem.Basic;
import java.util.Scanner;


public class Even_or_Odd {
    public static String Checker(int num){
    if ((num % 2)==0){
        return "Even";
    } else{
        return "Odd";
    }
}
    public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number to be checked:");
    int num = scanner.nextInt(); // Reads an integer
    
    System.out.println("The number is "+ Checker(num));

    scanner.close();
}
}
 
