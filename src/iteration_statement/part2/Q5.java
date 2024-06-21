package iteration_statement.part2;

import java.io.*;
import java.util.StringTokenizer;

// 반복제어문2 - 자가진단5 #545
public class Q5 {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      StringTokenizer st = new StringTokenizer(reader.readLine());
      int multiplesOf3 = 0;
      int multiplesOf5 = 0;
      for(int i = 0; i < 10; i++) {
        int num = Integer.parseInt(st.nextToken());
        if(num % 3 == 0) {
          multiplesOf3++;
        }
        if(num % 5 == 0) {
          multiplesOf5++;
        }
      }
      writer.write("Multiples of 3 : " + multiplesOf3);
      writer.write("\n");
      writer.write("Multiples of 5 : " + multiplesOf5);
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
