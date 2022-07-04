class Solution {
    public int solution(int[] numbers) {
        int res = 45;
        for (int i : numbers) {
            res -= i;
        }
        return res;
    }
}