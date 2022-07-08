class Solution {
        int[] mons = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
    public String solution(int a, int b) {
        int day = 0;
        for(int i=0; i<a; i++){
            day+= mons[i];
        }
        day -= mons[a-1]-b;
        
        return weeks[day%7];
    }
}