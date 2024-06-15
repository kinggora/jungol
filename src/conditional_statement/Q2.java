package conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단2 #529
public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int height = Integer.parseInt(input[0]);
        int weight = Integer.parseInt(input[1]);
        int bmi = weight + 100 - height;
        System.out.println(bmi);
        if(bmi > 0) {
            System.out.println("Obesity");
        }
    }
}