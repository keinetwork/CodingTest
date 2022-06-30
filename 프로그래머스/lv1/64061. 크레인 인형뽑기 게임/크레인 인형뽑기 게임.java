import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <moves.length ; i++) {
            int x = moves[i]-1;
            for (int j = 0; j <board.length ; j++) {
                if(board[j][x]!=0){
                    list.add(board[j][x]);
                    board[j][x] = 0;
                    int len = list.size();
                    if(len>1){
                        if(list.get(len-1) == list.get(len-2)){
                            answer += 2;
                            list.remove(len-2);
                            list.remove(len-2);
                        }
                    }
                    break;
                }
            }
        }
        return answer;
    }
}