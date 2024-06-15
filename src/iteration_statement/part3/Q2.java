package iteration_statement.part3;

import java.io.*;

// 반복제어문3 - 자가진단2 #634
public class Q2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            for(int i = 1; i <= n; i++) { // n개 행 출력
                for(int j = 0; j < i; j++) { // n번째 행 => n개 별(열)
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
