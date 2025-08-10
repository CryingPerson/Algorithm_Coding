import java.util.*;public class Main { public static void main(String[] args) {Scanner sc = new Scanner(System.in);int x = sc.nextInt(); int y = sc.nextInt(); char[][] board = new char[x][y];sc.nextLine();for(int i = 0; i < x; i++){String line = sc.nextLine();for (int j = 0; j < y; j++) {board[i][j] = line.charAt(j);}}for (int i = 0; i < board.length; i++) {for (int j = 0; j < board[0].length; j++) {char color = board[i][j]; if(color != '.'){board[i][j] = board[i][(y - (j+1))] = color;}}}for(char[] c : board){for (char ch : c) {System.out.print(ch);}
        System.out.println();
    }
    }

}
