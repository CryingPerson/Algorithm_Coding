import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suno = sc.nextInt();
        int gore = sc.nextInt();
        int han = sc.nextInt();

        if(suno + gore + han >= 100){
            System.out.println("OK");
            return;
        }
        int min = Math.min(Math.min(suno, gore), han);
        if(suno == min){
            System.out.println("Soongsil");
            return;
        }else if(min == gore){
            System.out.println("Korea");
            return;
        }else{
            System.out.println("Hanyang");
        }
    }
}
