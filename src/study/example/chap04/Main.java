package study.example.chap04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printA();
        printC();
        printB();
    }

    public static void printA() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a+b = " + (a+b));
    }

    public static void printB() {
        System.out.println("hello world");
    }

    public static void printC() {
        System.out.println("text");
        System.out.println("text22");
    }
}
