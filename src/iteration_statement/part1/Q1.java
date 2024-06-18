package iteration_statement.part1;

// 반복제어문1 - 자가진단1 #536
public class Q1 {
    public static void main(String[] args) {
        int num = 1;
        StringBuilder sb = new StringBuilder();
        while(num < 16) {
            sb.append(num).append(" ");
            num++;
        }
        System.out.print(sb);
    }
}
