package iteration_statement.part2;

import java.io.*;

// 반복제어문2 - 자가진단4 #544
public class Q4 {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      int num = Integer.parseInt(reader.readLine());
      int sum = 0;
      // num 부터 100 까지의 합
      for(int i = num; i <= 100; i++) {
        sum += i;
      }
      writer.write(String.valueOf(sum));
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
