import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]ans = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        int[] aa = simul(list);
        for(int num : aa) System.out.print(num + " ");
    }

    static int[] simul(List<Integer> list) {

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == 0){
                    if(num == 0){
                        arr[j] = i+1;
                        break;
                    }else{
                        num--;
                    }
                }
            }

        }
        return arr;
    }
}
