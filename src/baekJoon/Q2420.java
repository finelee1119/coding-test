package baekJoon;

import java.util.Scanner;

public class Q2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long result = Math.abs(N - M);

        System.out.println(result);
    }
}