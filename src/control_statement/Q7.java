package control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단7 #534
public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        switch (input) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Usually");
                break;
            case "D":
                System.out.println("Effort");
                break;
            case "F":
                System.out.println("Failure");
                break;
            default:
                System.out.println("error");
        }
    }
}
