package iteration_statement.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복제어문2 - 형성평가2 #131
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        if(start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for(int i = start; i <= end; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
        reader.close();
    }
}
