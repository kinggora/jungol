package conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단6 #533
public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        String a = input[0];
        int b = Integer.parseInt(input[1]);
        if(a.equals("M")) {
            if(b >= 18) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if(a.equals("F")) {
            if(b >= 18) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}