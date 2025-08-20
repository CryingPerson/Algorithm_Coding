import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] st = {"Mon","Tue","Wed","Thu","Fri"};
        int t = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        int total = 0;
        for (int i = 0; i < n; i++) {
            String[] split = sc.nextLine().split(" ");

            String stDay = split[0];
            int startSleep = Integer.parseInt(split[1]);
            String enDay = split[2];
            int wakeSleep = Integer.parseInt(split[3]);

            int num = 0, num2 = 0;
            for (int j = 0; j < st.length; j++) {
                if (st[j].equals(stDay)) num = j;
                if (st[j].equals(enDay)) num2 = j;
            }

            int dayDiff = (num2 - num + 5) % 5;
            int duration = dayDiff * 24 + (wakeSleep - startSleep);
            total += duration;
        }

        if (total >= t) {
            System.out.println(0);
        } else if (t - total <= 48) {
            System.out.println(t - total);
        } else {
            System.out.println(-1);
        }
    }
}
