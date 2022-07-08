class Solution {
    public long solution(int price, int money, int count) {
        long answer = count*(count+1)/2L*price;
        return Math.max(answer-money,0);
    }
}