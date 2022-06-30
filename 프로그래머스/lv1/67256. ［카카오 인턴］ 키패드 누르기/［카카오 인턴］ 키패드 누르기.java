class Solution {
    int[][] arr = {{3,1},
                   {0,0},{0,1},{0,2},
                    {1,0},{1,1},{1,2},
                    {2,0},{2,1},{2,2},
                    {3,0},{3,2}};
    public String solution(int[] numbers, String hand) {
        int[] left ={3,0};
        int[] right ={3,2};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            switch (arr[num][1]){
                case 0:{
                    left = arr[num];
                    sb.append("L");
                    break;
                }
                case 2:{
                    right = arr[num];
                    sb.append("R");
                    break;
                }
                case 1:{
                    int[] nPos = arr[num];
                    int x = Math.abs(nPos[0]-left[0])+Math.abs(nPos[1]-left[1]);
                    int y = Math.abs(nPos[0]-right[0])+Math.abs(nPos[1]-right[1]);
                    if(x==y){
                        if(hand.equals("right")){
                            right = arr[num];
                            sb.append("R");
                        }
                        else{
                            left = arr[num];
                            sb.append("L");
                        }
                    } else if (x < y) {
                        left = arr[num];
                        sb.append("L");
                    } else {
                        right = arr[num];
                        sb.append("R");
                    }
                    break;
                }
            }
        }
        return sb.toString();
    }
}