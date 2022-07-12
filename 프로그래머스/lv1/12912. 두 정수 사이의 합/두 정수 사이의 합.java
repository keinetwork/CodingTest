class Solution {
    public long solution(long a, long b) {
        if(a<b){
            long temp = a;
            a = b;
            b = temp;
        }
        long answer = (long)(Math.pow(a,2)-Math.pow(b,2)+a+b)/2;
        
        return answer;
    }
}