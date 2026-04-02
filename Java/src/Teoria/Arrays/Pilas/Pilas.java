package Teoria.Arrays.Pilas;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        System.out.println("Pila vacia: "+stack);
        System.out.println("Esta vacia?: "+stack.isEmpty());

        //add elements to the pila
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //Print elements
        for (Integer integer : stack) {
            System.out.print(integer);
        }

        //Remove the last item entered
        stack.pop();

        // Search an element specific inside the stack
        System.out.println("is number 3 there? "+ stack.search(3));

        // What was the last element in entered?
        System.out.println("Last element entered: "+stack.peek());




    }
}
