import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[101];
        int[] arr2 = new int[101];

        for (int i = 0; i < 10; i++) {
            arr1[sc.nextInt()]++;
        }
        for (int i = 0; i < 10; i++) {
            arr2[sc.nextInt()]++;
        }

        int require = 3;
        int aTotal = 0;
        for (int i = 100; i >= 0; i--) {
            if(require <= 0) break;
            if(arr1[i] != 0){
                for (int j = 0; j < arr1[i]; j++) {
                    aTotal += i;
                    require--;
                    if(require <= 0) break;
                }
            }
        }

        int require2 = 3;
        int aTotal2 = 0;
        for (int i = 100; i >= 0; i--) {
            if(require2 <= 0)break;
            if(arr2[i] != 0){
                for (int j = 0; j < arr2[i]; j++) {
                    aTotal2 += i;
                    require2--;
                    if(require2 <= 0) break;
                }
            }
        }
        System.out.println(aTotal + " " + aTotal2);
    }
}