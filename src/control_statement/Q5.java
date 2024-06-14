package control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단5 #532
public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        if(a >= 4.0 && b >= 4.0) {
            System.out.println("A");
        } else if(a >= 3.0 && b >= 3.0) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}