import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); long atack = sc.nextInt();

        List<int[]> save = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(); int monster = sc.nextInt(); int hp = sc.nextInt();

            save.add(new int[]{t,monster,hp});
        }

        long tempAttack = atack;
        long left = 0;
        long right = Long.MAX_VALUE;
        long min = Long.MAX_VALUE;
        while (left <= right) {
            long mid = (left + right) / 2;

            long curHp = mid;
            boolean game = false;
            atack = tempAttack;
            for (int[] info : save) {
                if(info[0] == 1){
                    long atc = info[1];
                    long monsterHp = info[2];

                    long hit = (monsterHp + atack - 1) / atack;
                    long total = atc * (hit - 1);

                    curHp -= total;

                    if(curHp <= 0){
                        game = true;
                        break;
                    }
                } else if (info[0] == 2) {
                    long plusAtck = info[1];
                    long plusHp = info[2];

                    atack += plusAtck;
                    if(curHp + plusHp >= mid){
                        curHp = mid;
                    }else curHp += plusHp;
                }
            }
            if(game){
                left = mid + 1;
            }else{
                min = Math.min(min, mid);
                right = mid - 1;
            }
        }
        System.out.println(min);
    }
}
