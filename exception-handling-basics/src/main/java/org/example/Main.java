package org.example;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // ArithmeticException
        /*var result = MathOps.divide(10, 0);
        System.out.println(result);*/

        /*try{
            var result2 = MathOps.divideBetter(10, 0);
            System.out.println("result2 = " + result2);
        } catch (Exception e){
            System.out.println("Catch exception: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass());
        }*/

        try{
            var result3 = MathOps.multiply();
            System.out.println("Result3 = " + result3);
        } catch (Exception e){
            System.out.println("Exception: " + e + "\nMessage: " + e.getMessage() + "\nStackTrace: " + Arrays.toString(e.getStackTrace()));
        }



        // Array Exception
//        ArrayOps.mockArrayOperation();
    }
}

