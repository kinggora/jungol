package iteration_statement.part1;

import java.io.*;

// 반복제어문1 - 자가진단6 #633
public class Q6 {
    public static void main(String[] args) {
        final String message = "1. Korea\n2. USA\n3. Japan\n4. China\nnumber? \n";
        final String[] capitalCities = {"Seoul", "Washington", "Tokyo", "Beijing"};
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            while(true) {
                String input = reader.readLine();
                if(input == null) {
                    break;
                }
                writer.write(message);
                int num = Integer.parseInt(input);
                if(num < 1 || num > 4) {
                    writer.write("none");
                    break;
                } else {
                    writer.write(capitalCities[num - 1] + "\n\n");
                }
            }
            writer.flush();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

