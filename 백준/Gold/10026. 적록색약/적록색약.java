import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int[]dx = {-1,0,1,0};
    public static int[]dy = {0,1,0,-1};
    public static int n;
    public static char[][] color;
    public static char[][] color2;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();
        color = new char[n][n];
        color2 = new char[n][n];
        for (int i = 0; i < n; i++) {
            color[i] = sc.nextLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            color2[i] = color[i].clone();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(Character.isAlphabetic(color[i][j])){
                    cnt++;
                    char ch = color[i][j];
                    DFS(i,j, ch);
                }
            }
        }
        System.out.print(cnt + " ");
        int snt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(Character.isAlphabetic(color2[i][j])){
                    snt++;
                    char ch = color2[i][j];
                    DFS2(i,j, ch);
                }
            }
        }
        System.out.print(snt);
    }
    public static void DFS(int x, int y, char cs){
        color[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && nx < n && ny >= 0 && ny < n && color[nx][ny] == cs){
                color[nx][ny] = 1;
                DFS(nx,ny,cs);
            }
        }
    }
    public static void DFS2(int x, int y, char cs){
        color2[x][y] = 1;
        if(cs == 'R' || cs == 'G'){
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >=0 && nx < n && ny >= 0 && ny < n && (color2[nx][ny] == 'R' || color2[nx][ny] == 'G')){
                    color2[nx][ny] = 1;
                    DFS2(nx,ny,cs);
                }
            }
        }else{
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >=0 && nx < n && ny >= 0 && ny < n && color2[nx][ny] == cs){
                    color2[nx][ny] = 1;
                    DFS2(nx,ny,cs);
                }
            }
        }
    }
}
