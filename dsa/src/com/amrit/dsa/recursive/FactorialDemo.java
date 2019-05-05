package com.amrit.dsa.recursive;
/**
 * @author amrit
 * Description:
 * ============
 * 1. Factorial of an Integer say n. is : [n * (n-1) * (n-2) *......* 2 * 1] = n! = n * (n-1)!
 * 2. Factorial can be impmented using two approach
 *      i) Recursive Approach
 *          Advantages:
 *          -----------
 *          a) Looks elegent and envolves less lines of coding
 *          b) calls itself
 *
 *          Disadvantages:
 *          --------------
 *          a) PRONE TO STACK OVER FLOW EXCEPTION
 *             # Must have breaking condition (BASE CONDITION) to end the recursion
 *             # If Base condition is not present, recursion will never end and eventually, stack will be overlflown
 *          b) Stack intensive operation and hence CONSUMES MORE MEMORY
 *             # As when ever recursion calls itself, the new method call is loaded on the top of the stacks
 *             # When it finishes , stack is unwinded
 *          c) TIME CONSUMING:  As a lot of processing happens inside e.g. stack level operations, it consumes more time
 *          d) EVEN BASE CONDITION does not guarantees safety to StackOverflowException
 *             # If a recursive method is supposed to go throgh million recursion , before it meets the Breaking condition,
 *               there is a bright chance that stack may overflow before it executes the Breaking Condition.
 *             # There is a workaround of this problem called (TAIL RECURSION), but is not supported by Java
 *      ii) Iterative Approach
 *          Advantages
 *          ---------
 *          a) Less Memory and Time consuming
 *          b) Less prone to StackOverFlow
 *          c) Better performance
 *
 *          Disadvantages:
 *          ---------------
 *          a) Implementation may be larger than the recursion
 *
 * */
public class FactorialDemo {

    public static void main (String [] args) {
        int inputNumber = 10;
        System.out.println("Using Recursion: [ " + inputNumber + "! = " + recursiveFactorial(inputNumber) + " ]");
        System.out.println("Using Iteration: [ " + inputNumber + "! = " + iterativeFactorial(inputNumber) + " ]");
    }

    /**
     * recursiveFactorial: Factorial Implementation using Recursion
     * */
    public static long recursiveFactorial(int number) {
        // BASE CONDITION
        if(number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number -1);
    }

    /**
     * iterativeFactorial: Factorial Implementation using Iteration
     * */
    public static long iterativeFactorial(int number) {
        // BASE CONDITION
        if(number == 0) {
            return 1;
        }
        int factorial = 1;

        for ( int value = number ; value > 0 ; value--)
        {
           // System.out.println("Using Iteration: [ Current Value: " +value+ " && factorialValue: " + factorial+ " ]");
            factorial = factorial * value;
        }
        //System.out.println("Using Iteration: [ " + number + "! = " +factorial + " ]");
        return factorial;
    }
}
