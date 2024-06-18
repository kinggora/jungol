package iteration_statement.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int cnt = 0;
        while(true) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                break;
            }
            if(num % 3 == 0 || num % 5 == 0) {
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
