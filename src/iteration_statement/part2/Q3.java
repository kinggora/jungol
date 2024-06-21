package iteration_statement.part2;

import java.io.*;

// 반복제어문2 - 자가진단3 #543
public class Q3 {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      int num = Integer.parseInt(reader.readLine());
      for(int i = 2; i <= num; i += 2) {
        writer.write(i + " ");
      }
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}