package iteration_statement.part3;

import java.io.*;

// 반복제어문3 - 자가진단7 #554
public class Q7 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            int number = 1;
            char alphabet = 'A';
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n - i; j++) {
                    writer.write(number++ + " ");
                }
                for(int j = 0; j < i + 1; j++) {
                    writer.write(alphabet++ + " ");
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
