import java.util.Arrays;

class Solution {
    class Stage implements Comparable<Stage>{
        public int index;
        public Float failer;
        public Stage(int index, float failer){
            this.index = index;
            this.failer = failer;
        }
        @Override
        public int compareTo(Stage o) {
            if(o.failer.equals(this.failer)){
                return this.index - o.index;
            }
            return o.failer.compareTo(this.failer);
        }
    }
    public int[] solution(int N, int[] stages) {
        Stage[] list = new Stage[N];
        int users =stages.length;
        for (int i = 1; i <=N ; i++) {
            int cnt = 0;
            for (int j = 0; j <stages.length ; j++) {
                if(stages[j]== i) cnt++;
            }
            Stage stage;
            if(users!=0){
                stage = new Stage(i, (float)cnt/users);
                users-= cnt;
            }else{
                stage = new Stage(i, 0);
            }
            list[i-1]=stage;
        }
        Arrays.sort(list);
        int[] answer = new int[N];
        for (int i = 0; i <N ; i++) {
            answer[i] = list[i].index;
        }
        return answer;
    }
}