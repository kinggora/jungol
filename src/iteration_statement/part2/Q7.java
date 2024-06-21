package iteration_statement.part2;

import java.io.*;

// 반복제어문2 - 자가진단7 #547
public class Q7 {
  public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      for(int i = 2; i <= 6; i++) {
        for(int j = 0; j < 5; j++) {
          writer.write((i + j) + " ");
        }
        writer.write("\n");
      }
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
