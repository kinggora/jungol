package iteration_statement.part3;

import java.util.Scanner;

// 반복제어문3 - 형성평가2 #141
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 100/num; i++) {
            int temp = num * i;
            System.out.print(temp + " ");
            if(temp % 10 == 0) {
                break;
            }
        }
    }
}
