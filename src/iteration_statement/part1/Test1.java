package iteration_statement.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복제어문1 - 형성평가1 #125
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
