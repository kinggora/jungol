package iteration_statement.part2;

import java.io.*;

// 반복제어문2 - 자가진단1 #541
public class Q1 {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    ) {
      String input = reader.readLine();
      for(int i = 0; i < 20; i++) {
        writer.write(input);
      }
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
