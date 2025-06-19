import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int count = Math.min(Math.min(N, M), K);

        Integer[] ham = new Integer[N];
        Integer[] poto = new Integer[M];
        Integer[] drink = new Integer[K];
        for (int i = 0; i < N; i++) {
            ham[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++){
            poto[i] = sc.nextInt();
        }
        for(int i = 0; i < K; i++){
            drink[i] = sc.nextInt();
        }

        Arrays.sort(ham, Collections.reverseOrder());
        Arrays.sort(poto, Collections.reverseOrder());
        Arrays.sort(drink,  Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += (int) ((ham[i] + poto[i] + drink[i]) * 0.9);;
        }
        if(count < N){
            for(int i = count; i < N; i++){
                sum += ham[i];
            }
        }
        if(count < M){
            for(int i = count; i < M; i++){
                sum += poto[i];
            }
        }
        if(count < K){
            for(int i = count; i < K; i++){
                sum += drink[i];
            }
        }
        int aa = 0;
        int sum1 = Arrays.stream(ham).mapToInt(i -> i).sum();
        int sum2 = Arrays.stream(poto).mapToInt(i -> i).sum();
        int sum3 = Arrays.stream(drink).mapToInt(i -> i).sum();

        aa += sum1 + sum2 + sum3;
        System.out.println(aa);
        System.out.println(sum);
    }
}
