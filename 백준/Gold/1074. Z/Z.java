import java.util.Scanner;

public class Main {
    static int[][] board;
    static int blue = 0;
    static int white = 0;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int size = (int) Math.pow(2,n);

        DFS(m,c,size);
        System.out.println(result);
    }
    public static void DFS(int m, int c, int size){
        if(size == 1) return;

        int halfSize = size / 2;
        if(m < halfSize && c < halfSize){
            DFS(m,c,halfSize);
        }else if(m < halfSize && c >= halfSize){
            result =  result + halfSize * halfSize;
            c = c - halfSize;
            DFS(m,c,halfSize);
        }else if(m >= halfSize && c < halfSize){
            result = result + halfSize *  halfSize * 2;
            m = m - halfSize;
            DFS(m,c,halfSize);
        }else if(m >= halfSize && c >= halfSize){
            result = result + halfSize * halfSize * 3;
            m = m - halfSize;
            c = c - halfSize;
            DFS(m,c,halfSize);
        }
    }
}
