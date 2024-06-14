package control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단3 #530
public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        if(age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println((20 - age) + " years later");
        }
    }
}
