package iteration_statement.part3;

import java.io.*;

// 반복제어문3 - 자가진단1 #549
public class Q1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            int sum = 0; // 홀수의 합
            int cnt = 0; // 홀수의 개수
            int oddNum = 1; // 홀수
            while(sum < n) {
                sum += oddNum;
                oddNum += 2;
                cnt++;
            }
            writer.write(cnt + " " + sum);
            writer.flush();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}