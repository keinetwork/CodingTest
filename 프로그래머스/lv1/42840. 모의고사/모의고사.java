import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] ac = new int[3];
        answer[2] = 3;
        for (int i = 0; i <answers.length ; i++) {
            // 1번
            answer[0] =(answer[0]%5)+1;
            if(answer[0]== answers[i]){
                ac[0]++;
            }
            //2번
            if(i%2==0){
                if(answers[i]==2){
                    ac[1]++;
                }
            }else{
                answer[1] =(answer[1]%5)+1;
                if(answer[1]==2)answer[1]++;
                if(answer[1]== answers[i]){
                    ac[1]++;
                }
            }
            // 3번
            if (i % 2 == 0) {
                if(answer[2]== answers[i]){
                    ac[2]++;
                }
            }else{
                if(answer[2]== answers[i]){
                    ac[2]++;
                }
                if( answer[2]==3){
                    answer[2] = 1;
                }else if( answer[2]==5){
                    answer[2] = 3;
                }else if( answer[2]==2){
                    answer[2] = 4;
                } else {    // 1, 4
                    answer[2] =(answer[2]%5)+1;
                }
            }

        }
        int max = 0;
        for (int i = 0; i <ac.length ; i++) {
            max = Math.max(max, ac[i]);
        }
        ArrayList<Integer> lsit = new ArrayList<>();
        for (int i = 0; i <ac.length ; i++) {
            if(ac[i]== max) lsit.add(i+1);
        }
        return lsit.stream().mapToInt(Integer::intValue).toArray();
    }
}