package control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단1 #528
public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println(num);
        if(num < 0) {
            System.out.println("minus");
        }
    }
}
