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

    public static int divideBetter(int dividend, int divisor){
        try{
            var result = dividend / divisor;
            System.out.println("inside the function:" + result);
            return result;
        } catch (Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass());
            throw e;
        }
    }

    public static int multiply() throws UnsupportedOperationException {
        System.out.println("inside the function");
        throw new UnsupportedOperationException("Multiply method is not implemented yet");
    }
}
