package iteration_statement.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복제어문1 - 형성평가5 #129
public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.print("Base = ");
            int base = Integer.parseInt(reader.readLine());
            System.out.print("Height = ");
            int height = Integer.parseInt(reader.readLine());
            System.out.printf("Triangle width = %.1f\n", base * height * 0.5);
            System.out.print("Continue? ");
            String response = reader.readLine();
            if(!("Y".equals(response) || "y".equals(response))) {
                break;
            }
        }
    }
}
