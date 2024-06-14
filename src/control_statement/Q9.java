package control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단9 #632
public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println(min);
    }
}

