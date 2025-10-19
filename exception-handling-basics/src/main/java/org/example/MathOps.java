package org.example;

public class MathOps {
    public static int divide(int dividend, int divisor){
        try{
            var result = dividend / divisor;
            System.out.println("inside the function:" + result);
            return result;
        } catch (ArithmeticException e){
            System.out.println("Error occurred:" + e.getMessage());
            return 0;
        }

    }
}
