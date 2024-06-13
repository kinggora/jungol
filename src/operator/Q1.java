package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연산자 - 자가진단1 #518
public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += Integer.parseInt(input[i]);
        }
        System.out.println("sum : " + sum);
        System.out.print("avg : " + sum / input.length);
    }
}