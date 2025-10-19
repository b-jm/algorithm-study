package baekjoon.sprout;

import java.util.Scanner;

public class InputCalc {
    public static void main(String[] args) {
        // 백준 10869번
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        // 백준 1008번
        double C = sc.nextInt();
        double D = sc.nextInt();

        System.out.println(C / D);

        // 백준 11382번
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);
    }

}
