public class GfG{

    // Function that prints numbers using while loop
    public static void printNumbers() {

        int count = 0;

        // while loop runs while the condition is true
        while (count < 5) {
            System.out.println(count);
            count++;
        }
    }

    public static void main(String[] args) {

        // Calling the function
        printNumbers();
    }
}