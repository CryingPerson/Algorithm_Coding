import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String A = input[0];
        String B = input[1];
        
        long sumA = 0;
        for (char c : A.toCharArray()) {
            sumA += c - '0';
        }
        
        long sumB = 0;
        for (char c : B.toCharArray()) {
            sumB += c - '0';
        }
        
        System.out.println(sumA * sumB);
    }
}