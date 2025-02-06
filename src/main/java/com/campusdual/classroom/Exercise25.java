package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> myStack = new Stack<>();
//        String[] nombresArray =  {"Smith","Montessori","Peralta","House"};
//        for(String s: nombresArray){
//            myStack.push(s);
//        }
        myStack.push("Smith");
        myStack.push("Montessori");
        myStack.push("Peralta");
        myStack.push("House");
        return myStack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        printAndEmptyStack(createStack());
    }



}
