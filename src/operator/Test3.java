package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 - 형성평가3 #113
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        width += 5;
        length  *= 2;

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.print("area = " + width * length);
        reader.close();
    }
}
