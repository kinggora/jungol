package beginner;

import java.util.Scanner;

public class StartTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n > 100 || m < 1 || m > 3) {
            System.out.println("INPUT ERROR!");
            return;
        }
        switch (m) {
            case 1:
                printTypeA(n);
                break;
            case 2:
                printTypeB(n);
                break;
            case 3:
                printTypeC(n);
                break;
        }
    }
    public static void printTypeA(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTypeB(int n) {
        for(int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void printTypeC(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n-i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


