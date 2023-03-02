package Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

//print all numbers
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);

        }
        System.out.println("*");
        //print first 6

        for (int i = 0; i < 6; i++) {
            System.out.print(integers[i]);

        }
        System.out.println("*");

        //even numbers
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                System.out.print(integers[i]);

            }
        }

        System.out.println("*");

        //digits at odd indexes
        for (int i = 0; i < integers.length; i++) {
            if (i % 2 != 0) {
                System.out.print(integers[i]);

            }
        }
        System.out.println("*");
        //all numbers backwards
        for (int i = integers.length-1; i >= 0; i--) {
                System.out.print(integers[i]);

        }
        System.out.println("*");
        //all numbers expect 5
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] != 5){
                System.out.print(integers[i]);
            }
        }
        System.out.println("*");
        //all numbers up to and including 7
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] <= 7){
                System.out.print(integers[i]);
            }
        }
        System.out.println("*");
        //all digits divisible by 3
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 3 == 0) {
                System.out.print(integers[i]);

            }
        }
        System.out.println("*");
        //sum of all digits
        int count = 0;
        for (int i = 0; i < integers.length; i++) {
            count += integers[i];

            }
        System.out.println(count);

        //sum of all digits greater or equal 4
        int summa = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] >= 4){
            summa += integers[i];
            }

        }
        System.out.println(summa);

        //the smallest and largest digit
        int large = 0;
        int small = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > large){
                large = integers[i];
            } else if (integers[i] < small){
                small = integers[i];
            }

        }
        System.out.println(large);
        System.out.println(small);

        }

    }


