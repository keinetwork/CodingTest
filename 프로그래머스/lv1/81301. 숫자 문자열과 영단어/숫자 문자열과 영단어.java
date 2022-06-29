class Solution {
    static int[] index;
    public int solution(String s) {
        String answer = find(s);
        return Integer.parseInt(answer);
    }

    public String find(String s){
        if(s.length()== 0) return "";
        if(s.length()==1) return s;
        int index = -1;
            index = s.indexOf("zero");
            if(index != -1){
                if(s.length()>= index+4){
                    return find(s.substring(0, index))+"0"+find(s.substring(index+4));
                } else {
                    return find(s.substring(0, index))+"0";
                }
            }
            index = s.indexOf("one");
            if (index != -1) {
                if(s.length()>= index+3) {
                    return find(s.substring(0, index)) + "1" + find(s.substring(index + 3));
                } else {
                    return find(s.substring(0, index)) + "1";
                }
            }
            index = s.indexOf("two");
            if (index != -1) {
                if(s.length()>= index+3) {
                    return find(s.substring(0, index)) + "2" + find(s.substring(index + 3));
                } else {
                    return find(s.substring(0, index)) + "2";
                }
            }
            index = s.indexOf("three");
            if (index != -1) {
                if(s.length()>= index+5) {
                    return find(s.substring(0, index)) + "3" + find(s.substring(index + 5));
                } else {
                    return find(s.substring(0, index)) + "3";
                }
            }
            index = s.indexOf("four");
            if(index != -1){
                if(s.length()>= index+4) {
                    return find(s.substring(0, index)) + "4" + find(s.substring(index + 4));
                }else{
                    return find(s.substring(0, index)) + "4";
                }
            }
            index = s.indexOf("five");
            if(index != -1){
                if(s.length()>= index+4) {
                    return find(s.substring(0, index)) + "5" + find(s.substring(index + 4));
                }else{
                    return find(s.substring(0, index)) + "5";
                }
            }
            index = s.indexOf("six");
            if(index != -1){
                if(s.length()>= index+3) {
                    return find(s.substring(0, index)) + "6" + find(s.substring(index + 3));
                }else{
                    return find(s.substring(0, index)) + "6";
                }
            }
            index = s.indexOf("seven");
            if(index != -1){
                if(s.length()>= index+5) {
                    return find(s.substring(0, index)) + "7" + find(s.substring(index + 5));
                }else{
                    return find(s.substring(0, index)) + "7";
                }
            }
            index = s.indexOf("eight");
            if(index != -1){
                if(s.length()>= index+5) {
                    return find(s.substring(0, index)) + "8" + find(s.substring(index + 5));
                }else{
                    return find(s.substring(0, index)) + "8";
                }
            }
            index = s.indexOf("nine");
            if (index != -1) {
                if(s.length()>= index+4) {
                    return find(s.substring(0, index)) + "9" + find(s.substring(index + 4));
                }else{
                    return find(s.substring(0, index)) + "9";
                }
            }
        return s;
    }
}