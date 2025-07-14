import java.util.*;

public class Main {
    static char[][] DNA = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'},
            {'A','T','C','G'}, {'G','A','G','T'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        char[] charArray = sc.nextLine().toCharArray();
        char answer = charArray[charArray.length-1];
        for (int i = n - 2; i >= 0; i--) {
            answer = DNA[getIndex(charArray[i])][getIndex(answer)];
        }
        System.out.println(answer);

    }

    static int getIndex(char ch) {
        if(ch == 'A') return 0;
        else if(ch == 'G') return 1;
        else if(ch == 'C') return 2;
        else return 3;
    }
}
