import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int i=0;
        while(d[i]<= budget) {
            budget -= d[i];            
            i++;
            if(i== d.length)break;
        }
        return i;
    }
}