package iteration_statement.part1;

// 반복제어문1 - 자가진단4 #539
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int sum = 0;
        int cnt = 0;
        while(true) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            cnt++;
            // 100 이상의 수가 입력되면 while 문을 빠져나옴
            if(num >= 100) {
                break;
            }
        }
        System.out.println(sum);
        System.out.printf("%.1f", sum / (double)cnt);
    }
}
