package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연산자 - 자가진단7 #524
public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        boolean c = (a != 0);
        boolean d = (b != 0);
        // 논리곱(AND) &&
        // 논리합(OR) ||
        System.out.printf("%s %s", c && d, c || d);
    }
}
