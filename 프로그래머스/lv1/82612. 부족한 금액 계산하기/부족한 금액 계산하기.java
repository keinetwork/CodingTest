class Solution {
    public long solution(int price, int money, int count) {
        long answer = count*(count+1)/2L*price;
        if(answer<money)
            return 0;
        return answer-money;
    }
}