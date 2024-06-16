package operator;

import java.io.*;
import java.util.StringTokenizer;

// 연산자 - 형성평가1 #111
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int kor = Integer.parseInt(st.nextToken());
        int eng = Integer.parseInt(st.nextToken());
        int math = Integer.parseInt(st.nextToken());
        int com = Integer.parseInt(st.nextToken());
        int sum = kor + eng + math + com;
        System.out.println("sum " + sum);
        System.out.print("avg " + (sum / 4));
        reader.close();
    }
}
