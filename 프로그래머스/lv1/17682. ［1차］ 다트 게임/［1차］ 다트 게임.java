import java.util.Arrays;

class Solution {
    char[] dart;
    public int getScore(int start, int end){
        int val =0;
        int rate = 1;
        for (int i = end; i >=start ; i--) {
            val += (dart[i]-'0')*rate;
            rate *= 10;
        }
        return val;
    }
    public int solution(String dartResult) {
        dart = dartResult.toCharArray();
        int start = 0;
        int index =0;
        int[] score = {0,0,0};
        for (int i = start; i <dart.length ; i++) {
            if(dart[i]=='S'){
                score[index] = getScore(start, i-1);
                score[index] = (int)Math.pow(score[index], 1);
                if(i+1<dart.length){
                    if(dart[i+1]=='*'){
                        if(index>0) {
                            score[index - 1] *= 2;
                        }
                        score[index] *= 2;
                        i++;
                    } else if(dart[i+1]=='#'){
                        score[index] *= -1;
                        i++;
                    }
                }
                index++;
                start = i+1;
            }
            if(dart[i]=='D'){
                score[index] = getScore(start, i-1);
                score[index] = (int)Math.pow(score[index], 2);
                if(i+1<dart.length){
                    if(dart[i+1]=='*'){
                        if(index>0) {
                            score[index - 1] *= 2;
                        }
                        score[index] *= 2;
                        i++;
                    } else if(dart[i+1]=='#'){
                        score[index] *= -1;
                        i++;
                    }
                }
                start = i+1;
                index++;
            }
            if(dart[i]=='T'){
                score[index] = getScore(start, i-1);
                score[index] = (int)Math.pow(score[index], 3);
                if(i+1<dart.length){
                    if(dart[i+1]=='*'){
                        if(index>0) {
                            score[index - 1] *= 2;
                        }
                        score[index] *= 2;
                        i++;
                    } else if(dart[i+1]=='#'){
                        score[index] *= -1;
                        i++;
                    }
                }
                start = i+1;
                index++;
            }
        }
        return score[0]+score[1]+score[2];
    }
}