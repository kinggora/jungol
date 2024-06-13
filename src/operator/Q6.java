package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연산자 - 자가진단6 #523
public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.printf("%d > %d --- %d\n", a, b, a > b ? 1 : 0);
        System.out.printf("%d < %d --- %d\n", a, b, a < b ? 1 : 0);
        System.out.printf("%d >= %d --- %d\n", a, b, a >= b ? 1 : 0);
        System.out.printf("%d <= %d --- %d", a, b, a <= b ? 1 : 0);
    }
}