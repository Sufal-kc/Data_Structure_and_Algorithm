// In a Stack data structure, elements are inserted and removed following the LIFO (Last In, First Out) principle.
//  A class can be used to define the structure of the stack and the operations performed on it. 
// Class representing a Stack
class Stack {
    int[] arr = new int[5];
    int top = -1;

    // Method to push element
    void push(int x) {
        if(top == 4) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Method to pop element
    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    // Method to display stack
    void display() {
        for(int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class stack {

    // driver code
    public static void main(String[] args) {

        // Creating stack object
        Stack s = new Stack();

        // Performing operations
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.print("Stack elements: ");
        s.display();

        s.pop();

        System.out.print("After pop: ");
        s.display();
    }
}