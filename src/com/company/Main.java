package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle.run();
        Rectangle.run();
        Array.run();
    }
}

class Triangle{
    private int a;
    private int b;
    private int c;
    Triangle(){
        this.a = 3;
        this.b = 3;
        this.c = 3;
    }

    private static Triangle ABC = new Triangle();

    private static void Length(){
        System.out.println(ABC.a);
        System.out.println(ABC.b);
        System.out.println(ABC.c);
    }

    private static void findP(){
        int P = ABC.a + ABC.b + ABC.c;
        System.out.println("P(ABC) = " + P);
    }

    private static void findS(){
        double P = (ABC.a + ABC.b + ABC.c)/2.0;
        double S = Math.sqrt(P*(P-3)*(P-3)*(P-3));
        System.out.println("S(ABC) = " + S);
    }

    public static void run(){
        System.out.println("Triangle");
        Length();
        findP();
        findS();
        System.out.println("Triangle done");
        System.out.println(" ");
    }
}

class Rectangle {
    private int a, b;

    Rectangle() {
        this.a = 4;
        this.b = 3;
    }

    private static Rectangle ABCD = new Rectangle();

    private static void Length(){
        System.out.println(ABCD.a);
        System.out.println(ABCD.b);
    }

    private static void findP() {
        int P = (ABCD.a + ABCD.b) * 2;
        System.out.println("P(ABCD) = " + P);
    }

    private static void findS() {
        int S = ABCD.a * ABCD.b;
        System.out.println("S(ABCD) = " + S);
    }

    public static void run(){
        System.out.println("Rectangle");
        Length();
        findP();
        findS();
        System.out.println("Rectangle done");
        System.out.println(" ");
    }

}

class Array {
    private int[] intArray;
    static private int n;

    Array(int n) {
        this.intArray = new int[n];
    }

    private static Scanner sc = new Scanner(System.in);

    private static Array create() {
        System.out.println("create() Array");
        System.out.print("Length = ");
        n = sc.nextInt();
        Array Massiv = new Array(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "] = ");
            Massiv.intArray[i] = sc.nextInt();
        }
        return Massiv;
    }

    static private Array Massive = create();

    private static void view() {
        System.out.println("view()");
        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "] = ");
            System.out.println(Massive.intArray[i]);
        }
    }

    private static void sort(){
        System.out.println("sort() done");
        int b;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++){
                if (Massive.intArray[k] > Massive.intArray[i])
                {
                    b = Massive.intArray[k];
                    Massive.intArray[k] = Massive.intArray[i];
                    Massive.intArray[i] = b;
                }
            }
        }
    }


    public static void run(){
        System.out.println("Array");
        //create();
        view();
        sort();
        view();
        System.out.println("Array done");
        System.out.println(" ");
    }

}