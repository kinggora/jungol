package iteration_statement.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 반복제어문1 - 형성평가3 #127
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int sum = 0;
        int cnt = 0;
        while(true) {
            int num = Integer.parseInt(st.nextToken());
            if(num < 0 || num > 100) {
                break;
            }
            sum += num;
            cnt++;
        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double)sum / cnt);
    }
}
