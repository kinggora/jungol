package iteration_statement.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 반복제어문2 - 형성평가5 #134
public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even : " + even);
        System.out.print("odd : " + odd);
        reader.close();
    }
}
