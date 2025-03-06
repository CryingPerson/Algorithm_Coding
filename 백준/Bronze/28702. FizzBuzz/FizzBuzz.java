import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static char[][] board;
    public static int col;

    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String a = kb.nextLine();
        String b = kb.nextLine();
        String c = kb.nextLine();

        if(isNumber(c)){
            int i = Integer.parseInt(c) + 1;
            String s = String.valueOf(i);
            if(finalCheck(s).equals("FizzBuzz")){
                System.out.println("FizzBuzz");
            }else if(finalCheck(s).equals("Fizz")){
                System.out.println("Fizz");
            }else if(finalCheck(s).equals("Buzz")){
                System.out.println("Buzz");
            }else{
                System.out.println(Integer.parseInt(s));
            }
        }else{
            if(isNumber(a)){
                int i = Integer.parseInt(a) + 3;
                String s = String.valueOf(i);
                if(finalCheck(s).equals("FizzBuzz")){
                    System.out.println("FizzBuzz");
                }else if(finalCheck(s).equals("Fizz")){
                    System.out.println("Fizz");
                }else if(finalCheck(s).equals("Buzz")){
                    System.out.println("Buzz");
                }else{
                    System.out.println(Integer.parseInt(s));
                }
            }
            else if(isNumber(b)){
                int i = Integer.parseInt(b) + 2;
                String s = String.valueOf(i);
                if(finalCheck(s).equals("FizzBuzz")){
                    System.out.println("FizzBuzz");
                }else if(finalCheck(s).equals("Fizz")){
                    System.out.println("Fizz");
                }else if(finalCheck(s).equals("Buzz")){
                    System.out.println("Buzz");
                }else{
                    System.out.println(Integer.parseInt(s));
                }
            }
        }
    }
    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static String finalCheck(String  numbers) {
        int number = Integer.parseInt(numbers);
        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if(number % 3== 0 && number % 5 != 0) return "Fizz";
        if(number % 3 != 0 && number % 5 == 0) return "Buzz";
        else return String.valueOf(number);
    }
}