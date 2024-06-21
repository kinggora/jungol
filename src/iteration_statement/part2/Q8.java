package iteration_statement.part2;

import java.io.*;

// 반복제어문2 - 자가진단8 #548
public class Q8 {
  public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      for(int i = 2; i <= 4; i++) {
        for(int j = 1; j <= 5; j++) {
          writer.write(String.format("%d * %d = %2d   ", i, j, i * j));
        }
        writer.write("\n");
      }
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
