class Solution {
    public int solution(String s) {
        String[] repl = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(repl[i],Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}