package iteration_statement.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복제어문2 - 형성평가6 #135
public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        int cnt = 0;
        int sum = 0;
        if(start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
                cnt++;
            }
        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double) sum / cnt);
    }
}
