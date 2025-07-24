import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // 알파벳은 두번 등장한다 각각
        // 그럼 나올떄마다 거기에 맞는값을 i를 통해 넣어준다
        // idx를 통해 어디에 넣을지 정한다
        // pos의 두번쨰 배열에 2를 어케 설정할지 고민
        // 26개의 알바펫 베열을 만들고 어차피 2번등장하니까 등장할떄마다 거기에 맞게 0 일떄 ++ 해주고 그다음에1을 넣어준다
        int[][] pos = new int[26][2];
        int[] alpabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';

            pos[idx][alpabet[idx]++] = i;
        }

        int sum = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                int a1 = pos[i][0] ; int a2 = pos[i][1];

                int b1 = pos[j][0]; int b2 = pos[j][1];

                int cnt = 0;
                if(a1 < b1 && b1 < a2) cnt++;
                if(a1 < b2 && b2 < a2) cnt++;

                if(cnt == 1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

}
