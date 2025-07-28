import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        while (true) {

            int hitWeigh = sc.nextInt();
            int curWeight = sc.nextInt();

            int first = hitWeigh / 2;
            int end = hitWeigh * 2;
            if (hitWeigh == 0 && curWeight == 0) break;

            sc.nextLine();
            boolean died = false;
            while (true) {
                String line = sc.nextLine();
                String[] charArray = line.split(" ");
                String c = charArray[0];
                String c2 = charArray[1];
                if (c.equals("#") && c2.equals("0")) break;
                if(died) continue;


                if(c.equals("F")){
                    curWeight += Integer.parseInt(String.valueOf(c2));
                }else{
                    curWeight -= Integer.parseInt(String.valueOf(c2));
                }
                if(curWeight <= 0){
                    died = true;
                }
            }
            if(died){
                System.out.println(idx + " " + "RIP");
                idx++;
                continue;
            }
            if (first < curWeight && curWeight < end) {
                System.out.println(idx + " " + ":-)");
            }else{
                System.out.println(idx + " " + ":-(");
            }
            idx++;
        }
    }
}
