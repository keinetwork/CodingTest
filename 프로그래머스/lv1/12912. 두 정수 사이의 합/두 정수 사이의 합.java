class Solution {
    public long solution(long a, long b) {
        if(a<b){
            long temp = a;
            a = b;
            b = temp;
        }
        // a*(a+1)/2-(b-1)*b/2
        // (a*(a+1)-(b-1)*b)/2
        // (a2+a-b2+b)/2 = ((a+b)*(a-b+1))/2
        
        return (a+b)*(a-b+1)/2;
    }
}