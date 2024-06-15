package conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택제어문 - 자가진단8 #535
public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double dbNum = Double.parseDouble(reader.readLine());
        // 실수를 정수로 변환시 소수점 이하는 버려짐
        switch ((int)dbNum) {
            case 4:
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            default:
                System.out.println("retake");
        }
    }
}