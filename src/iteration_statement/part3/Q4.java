package iteration_statement.part3;

import java.io.*;

// 반복제어문3 - 자가진단4 #551
public class Q4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            for(int i = 0; i < n; i++) {
                // 공백 i개 출력
                for(int j = 0; j < i; j++) {
                    writer.write(" ");
                }
                // 별 (n-i)개 출력
                for(int j = 0; j < n - i; j++) {
                    writer.write("*");
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
