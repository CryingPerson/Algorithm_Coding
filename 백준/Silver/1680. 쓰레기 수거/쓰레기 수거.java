import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int totalLength = 0;
            int maxWeight = sc.nextInt(); int place = sc.nextInt(); int continueLoength = 0; int curWeigh = 0;
            int max = -1;
            int cur = 0; int preLength = 0;
            for (int j = 0; j < place; j++) {
                int xLength = sc.nextInt();
                int weigh = sc.nextInt();

                cur += weigh;
                continueLoength += xLength - preLength;

                if(cur == maxWeight){
                    totalLength += 2 * continueLoength;
                    cur = 0;
                } else if (cur > maxWeight) {
                    totalLength += 2 * continueLoength;
                    cur = 0;
                    cur += weigh;
                }

                preLength = xLength;
            }
            if(cur != 0)totalLength += 2 * preLength
                    ;
            System.out.println(totalLength);
        }
    }
}
