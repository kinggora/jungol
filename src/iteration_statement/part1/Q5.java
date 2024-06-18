package iteration_statement.part1;

import java.io.*;

// 반복제어문1 - 자가진단5 #540
public class Q5 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            while(true) {
                int input = Integer.parseInt(reader.readLine());
                if(input == -1) {
                    break;
                }
                if(input % 3 == 0) {
                    writer.write(input / 3 + "\n");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}