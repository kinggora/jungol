package iteration_statement.part3;

import java.util.Scanner;

// 반복제어문3 - 형성평가1 #140
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < 20; i++) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }
            sum += num;
            cnt++;
        }
        System.out.println(sum + " " + sum/cnt);
    }
}
