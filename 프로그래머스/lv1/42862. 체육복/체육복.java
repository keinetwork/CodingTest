import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n-lost.length;
        for (int i = 0; i <reserve.length ; i++) {
            for (int j = 0; j <lost.length ; j++) {
                if(reserve[i]==lost[j]){
                    lost[j]=0;
                    reserve[i]=0;
                    answer++;
                    break;
                }
            }
        }
        for (int i = 0; i <reserve.length ; i++) {
            if(reserve[i] != 0 ) {
                for (int j = 0; j < lost.length; j++) {
                    if (lost[j] != 0 && Math.abs(reserve[i] - lost[j]) == 1) {
                        lost[j] = 0;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
