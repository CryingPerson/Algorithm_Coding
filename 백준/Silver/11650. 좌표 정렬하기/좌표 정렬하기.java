import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        int[][]arr=new int[N][2];
        for(int i=0; i<N; i++)
        {
            StringTokenizer str=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(str.nextToken());
            arr[i][1]=Integer.parseInt(str.nextToken());

        }
        Arrays.sort(arr ,(arr1,arr2) -> {
            if (arr1[0] == arr2[0]) {
                return arr1[1] - arr2[1];
            } else {
                return arr1[0] - arr2[0];
            }
        });
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}