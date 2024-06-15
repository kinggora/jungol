package iteration_statement.part3;

import java.io.*;

// 반복제어문3 - 자가진단3 #550
public class Q3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            for(int i = n; i > 0; i--) {
                for(int j = 0; j < i; j++) {
                    writer.write("*");
                }
                writer.write("\n");
            }
            for(int i = 1; i <= n; i++) {
                for(int j = 0; j < i; j++) {
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
