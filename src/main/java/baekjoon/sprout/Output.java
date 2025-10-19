package baekjoon.sprout;

import java.time.LocalDate;
import java.time.ZoneId;

public class Output {
    public static void main(String[] args) {
        // 백준 2557번
        System.out.print("Hello World\n");
        System.out.printf("Hello World");
        System.out.println("Hello World");

        // 백준 10699번
        LocalDate todayInSeoul = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(todayInSeoul);
    }
}
