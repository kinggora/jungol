package iteration_statement.part3;

import java.io.*;

// 반복제어문3 - 자가진단6 #553
public class Q6 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            char alphabet = 'A';
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n - i; j++) {
                    writer.write(alphabet++);
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
