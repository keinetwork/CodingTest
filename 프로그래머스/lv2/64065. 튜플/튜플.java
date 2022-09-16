import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        String str = s.replace("{", "").replace("}}","");
        String[] tuple = str.split("},");
        int[][] it = new int [tuple.length][tuple.length];
        for(int idx=0; idx<tuple.length; idx++) {
            int[] arr = Arrays.stream(tuple[idx].split(",")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            it[arr.length-1] = arr;
        }
        int[] answer = new int[tuple.length];
        for(int idx=0; idx<answer.length; idx++) {
            int tdx = 0;
            if(idx!=0){
                for (tdx = 0; tdx <idx ; tdx++) {
                    if(it[idx][tdx] != it[idx-1][tdx]) {
                        break;
                    }
                }
            }
            answer[idx] = it[idx][tdx];
        }
        return answer;
    }
}