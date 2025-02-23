import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            int sum = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).sum();
            System.out.println(sum);
        }
    }
}