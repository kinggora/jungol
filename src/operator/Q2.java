package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연산자 - 자가진단2 #519
public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int result1 = Integer.parseInt(input[0]) + 100;
        int result2 = Integer.parseInt(input[1]) % 10;
        System.out.print(result1 + " " + result2);
    }
}