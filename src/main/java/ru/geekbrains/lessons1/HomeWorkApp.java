package ru.geekbrains.lessons1;

public class HomeWorkApp {
    public static void main(String[] args) {
        //lesson one---
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //lesson one done

        //lesson two ---
        checkSumm(1,5);
        checkNumber(11);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 6;
        int b = 9;
        int summ = a + b;
        if (summ >= 0)
            System.out.println("Summ of numbers is positive");
        else
            System.out.println("Summ of numbers is negative");

    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 13;
        int b = 44;
        if (a >= b)
            System.out.println(" a >= b ");
        else
            System.out.println(" a < b ");
    }
    // lesson 2
    public static boolean checkSumm(int numberOne, int numberTwo) {
        if ((numberOne+numberTwo) >= 10 && (numberOne+numberTwo) <= 20)
            return true;
        else
            return false;
    }
    public static void checkNumber(int numberOne) {
        if (numberOne >= 0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
    }

    public static boolean isNegativeNumber (int numberOne) {
        if (numberOne >= 0)
            return false;
        else
            return true;
    }

    public static void printString (String someString, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(someString);
        }
    }

    public static boolean findDeathYear (int year) {
        boolean tmp = false;
        if ((year % 4 == 0) || year % 400 == 0) {
            if (year % 100 != 0)
                tmp = true;
        }
        return tmp;
    }

}
