import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if(str1.equals(str2)) return 65536;
        String pattern = "^[A-Z]*";
        ArrayList<String> s1 = new ArrayList<>();
        for(int i=0; i<str1.length()-1; i++) {
            String str = str1.substring(i, i+2);
            if( str.matches(pattern) ) {
                s1.add(str);
            }
        }
        ArrayList<String> s2 = new ArrayList<>();
        for(int i=0; i<str2.length()-1; i++) {
            String str = str2.substring(i, i+2);
            if( str.matches(pattern) ) {
                s2.add(str);
            }
        }

        int a = s1.size();
        for (String s:s2) {
            s1.remove(s);
        }

        a -= s1.size();
        int b = s1.size() + s2.size();
        return (int)((a*1.f/b)*65536);
    }
}