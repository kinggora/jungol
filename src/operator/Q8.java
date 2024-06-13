package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연산자 - 자가진단8 #525
public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        int n3 = Integer.parseInt(input[2]);
        boolean result1 = (n1 > n2) && (n1 > n3);
        boolean result2 = (n1 == n2) && (n2 == n3);
        System.out.println(result1 + " " + result2);
    }
}