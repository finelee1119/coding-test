package baekJoon;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 1;

        for (int i = N; i > 0; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}