package ru.geekbrains.lessons1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        //lesson one done
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
}
