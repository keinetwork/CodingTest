class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int p =0, y=0;
        for (int i = 0; i <str.length() ; i++) {
            switch (str.charAt(i)){
                case 'p': p++; break;
                case 'y': y++; break;
            }
        }
        return p==y ? true : false;
    }
}