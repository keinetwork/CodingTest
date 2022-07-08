class Solution {
    public int solution(int[][] sizes) {
        int[] res = new int[2];
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                res[0] = Math.max(res[0], sizes[i][0]);
                res[1] = Math.max(res[1], sizes[i][1]);
            }else{
                res[0] = Math.max(res[0], sizes[i][1]);
                res[1] = Math.max(res[1], sizes[i][0]);
            }
        }
        return res[0]*res[1];
    }
}