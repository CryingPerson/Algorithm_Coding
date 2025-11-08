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

        int w = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();
        

        // 2 3 1

        //
        int team = Math.min(w / 2, m);
        
        int answer = Math.min(team, (w + m - k) / 3);

        System.out.println(answer);



    }
}