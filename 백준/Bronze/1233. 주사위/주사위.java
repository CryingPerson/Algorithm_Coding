import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt(); int s2 = sc.nextInt(); int s3 = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        int[] arr = new int[100];
        for(int i = 1; i <= s1; i++){
            for(int j = 1; j <= s2; j++){
                for(int k = 1; k <= s3; k++){
                    arr[i+j+k]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                num = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i =0; i < arr.length; i++){
            if(arr[i] == max){
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}

