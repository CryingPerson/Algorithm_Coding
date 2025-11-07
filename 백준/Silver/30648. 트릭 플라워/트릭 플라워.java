import java.util.*;
import java.io.IOException;

// Card 클래스는 카드의 정보 (주인 번호와 카드 값)를 저장합니다.
class Card {
    int ownerIdx; // 카드 주인 번호 (1부터 N까지)
    int value;    // 카드에 적힌 수 (X)

    public Card(int ownerIdx, int value) {
        this.ownerIdx = ownerIdx;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt();

        int r = sc.nextInt();

        Set<String> set = new HashSet<>();

        set.add(a + "," + b);

        int nx = -1; int ny = -1;
        int count = 1;
        while (true) {
            if((a + 1) + (b + 1) < r){
                nx = a + 1; ny = b + 1;
            }else{
                nx = a / 2; ny = b / 2;
            }
            String next = nx + "," + ny;
            if (set.contains(next)) {
                break;
            }else{
                set.add(next);
                count++;
            }
            a = nx; b = ny;
        }
        System.out.println(count);
    }
}