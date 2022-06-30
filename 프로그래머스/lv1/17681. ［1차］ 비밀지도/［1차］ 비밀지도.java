class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i <n ; i++) {
            answer[i] = "";
            String block;
            for (int j = 1; j <n ; j++) {
                block = " ";
                int div = (int)Math.pow(2,n-j);
                if(arr1[i]/div>0){
                    block="#";
                    arr1[i]%=div;
                }
                if(arr2[i]/div>0){
                    block="#";
                    arr2[i]%=div;
                }
                answer[i] += block;
            }
            block = " ";
            if(arr1[i]%2>0){
                block="#";
            }
            if(arr2[i]%2>0){
                block="#";
            }
            answer[i] += block;
        }
        return answer;
    }
}