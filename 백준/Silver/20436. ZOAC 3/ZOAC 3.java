import java.util.*;

public class Main {
    static int[][] ans;
    static int idx = 0;
    static int x = 0;
    static int y = 0;
    static String[][] ch = {{"q","w","e","r","t","y","u","i","o","p"},
            {"a","s","d","f","g","h","j","k","l"," "},
            {"z","x","c","v","b","n","m"," "," "," "}};
    static char first = 'R';
    static boolean check = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        String s = sc.next(); String s2 = sc.next();

        int x1 = -1; int y1 = -1; int x2= - 1; int y2 =- 1;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {

                if(s.equals(ch[i][j])){
                     x1 = i;
                     y1 = j;
                }
                if(s2.equals(ch[i][j])){
                    x2 = i;
                    y2 = j;
                }
            }
        }
        int fy = 5;
        int f3y = 4;
        int findX = -1;
        int findY = -1;
        String answer = sc.next();
        for(char ss : answer.toCharArray()){
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < ch[0].length; j++) {
                    if(ch[i][j].charAt(0) == ss){
                        findX = i;
                        findY = j;
                    }
                }
            }
            if(findY < fy  && findX < 2 || findX > 1 && findY < f3y){
                if(findX != x1 || findY != y1){
                    int a = Math.abs(findX - x1) + Math.abs(findY - y1);
                    cont += a;
                    x1 = findX;
                    y1 = findY;
                }
            }else{
                if(findX != x2 || findY != y2){
                    int a = Math.abs(findX - x2) + Math.abs(findY - y2);
                    cont += a;

                    x2 = findX;
                    y2 = findY;
                }
            }
            cont++;
        }


        System.out.println(cont);


    }
}

