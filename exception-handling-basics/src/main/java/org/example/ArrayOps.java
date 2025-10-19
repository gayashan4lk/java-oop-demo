package org.example;

public class ArrayOps {
    public static void mockArrayOperation() {
        try {
            int[] numbers = new int[5];
            numbers[7] = 1;
            System.out.println(numbers[0]);
        } catch (ArithmeticException e) {
          System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
