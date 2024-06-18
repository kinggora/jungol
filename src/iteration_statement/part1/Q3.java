package iteration_statement.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복제어문1 - 자가진단3 #538
public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int sum = 0;
        while(num > 0) {
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}
