package iteration_statement.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복제어문2 - 형성평가1 #130
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println("JUNGOL");
        }
        reader.close();
    }
}
