package iteration_statement.part2;

import java.io.*;
import java.util.StringTokenizer;

// 반복제어문2 - 자가진단6 #546
public class Q6 {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
      int n = Integer.parseInt(reader.readLine()); // 과목 수
      StringTokenizer st = new StringTokenizer(reader.readLine()); // 과목 점수
      int sum = 0;
      for(int i = 0; i < n; i++) {
        int score = Integer.parseInt(st.nextToken());
        sum += score;
      }
      double avg = (double) sum / n;
      writer.write("avg : " + String.format("%.1f", avg));
      if(avg > 80) {
        writer.write("\npass");
      } else {
        writer.write("\nfail");
      }
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
