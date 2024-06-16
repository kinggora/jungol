package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 - 형성평가5 #115
public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] minsu = new int[2];
        int[] kiyoung = new int[2];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        minsu[0] = Integer.parseInt(st.nextToken()); // 민수의 키
        minsu[1] = Integer.parseInt(st.nextToken()); // 민수의 몸무게

        st = new StringTokenizer(reader.readLine());
        kiyoung[0] = Integer.parseInt(st.nextToken()); // 기영의 키
        kiyoung[1] = Integer.parseInt(st.nextToken()); // 기영의 몸무게

        System.out.println(minsu[0] > kiyoung[0] && minsu[1] > kiyoung[1]);
        reader.close();
    }
}
