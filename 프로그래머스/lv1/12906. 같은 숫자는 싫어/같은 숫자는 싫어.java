import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int diff = -1;
        for(int i=0; i<arr.length; i++){
            if(diff != arr[i]){
                list.add(arr[i]);
                diff = arr[i];
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}