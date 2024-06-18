package iteration_statement.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 반복제어문1 - 형성평가2 #126
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int odd = 0;
        int even = 0;
        while(true) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 0) {
                break;
            }
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd : " + odd);
        System.out.print("even : " + even);
    }
}
