package iteration_statement.part2;

import java.io.*;

// 반복제어문2 - 자가진단2 #542
public class Q2 {
  public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      for(int i = 10; i <= 20; i++) {
        writer.write(i + " ");
      }
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}