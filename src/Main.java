import java.util.*;
public class Main {
    public static void main(String[] args) {

    }

    public static String[][] fourByFour() {
        String[][] board = new String[3][3];
        int count = 0;
        while (count < 2) {
        for(int i = 0 ; i<3 ; i++){
            board[0][i] = "Q";
            placeRemained(board,0,i);

        }
        }
    }
public static void placeRemained(String[][] board, int r ,int c){
        for(int i = 0 ; i<board[0].length ; i++){
            //make rows unavailable
            if(!board[r][i].equals("Q")){
                board[r][i] = "-";
            }
        }
        //make columns unavailable
        for(int i = 0 ; i<board.length ; i++){
            if(!board[i][c].equals("Q")){
                board[i][c] = "-";
            }
        }
        //make diagonal unavailable
        for(int i = 0 ; i<)
}
}
