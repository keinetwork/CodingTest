class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            sb.setLength(0);
            for (int j = 1; j <n ; j++) {
                boolean block=false;
                int div = (int)Math.pow(2,n-j);
                if(arr1[i]/div>0){
                    block=true;
                    arr1[i]%=div;
                }
                if(arr2[i]/div>0){
                    block=true;
                    arr2[i]%=div;
                }
                if(block){
                    sb.append("#");
                } else{
                    sb.append(" ");
                }
            }
            boolean block=false;
            if(arr1[i]%2>0){
                block = true;
            }
            if(!block &&arr2[i]%2>0){
                block=true;
            }
            if(block){
                sb.append("#");
            } else{
                sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}