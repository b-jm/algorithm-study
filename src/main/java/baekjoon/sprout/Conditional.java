package baekjoon.sprout;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        compare(A, B);

        int grade = sc.nextInt();
        getGrade(grade);

        int x = sc.nextInt();
        int y = sc.nextInt();
        getQuadrant(x, y);

        int year = sc.nextInt();
        isLeapYear(year);

        long N = sc.nextInt();
        long M = sc.nextInt();
        System.out.println(calculateDifference(N, M));

        sc.close();
    }

    // 백준 1330번
    private static void compare(int A, int B) {
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        }  else {
            System.out.println("=");
        }
    }

    // 백준 9498번
    private static void getGrade(int grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

    // 백준 14681번
    private static void getQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }
    }

    // 백준 2753번
    private static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    // 백준 2420번
    private static long calculateDifference(long N, long M) {
        return Math.abs(N - M);
    }
}
