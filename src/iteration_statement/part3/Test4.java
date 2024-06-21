package iteration_statement.part3;

import java.util.Scanner;

// 반복제어문3 - 형성평가4 #143
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
