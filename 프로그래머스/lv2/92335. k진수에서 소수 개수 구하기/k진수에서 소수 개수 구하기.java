class Solution {
    public int solution(int n, int k) {
        String[] prime = Integer.toString(n,k).split("0");
        int answer =0;
        for(String p : prime){
            if(p.isEmpty()) continue;
            if(isPrime(Long.parseLong(p))){
                answer++;
            }
        }
        return answer;
    }

    boolean isPrime(long val){
        if(val<2) return false;
        for( int i=2; i<=Math.sqrt(val); i++){
            if(val%i==0) return false;
        }
        return true;
    }
}