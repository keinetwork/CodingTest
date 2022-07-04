import java.util.Arrays;

class Solution {
    boolean[] prime;
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int len = nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
        prime = new boolean[len+1];
        setPrime();
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                for (int k =j+1; k <nums.length ; k++) {
                    int val = nums[i]+nums[j]+nums[k];
                    if(!prime[val]){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public void setPrime(){
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <Math.sqrt(prime.length) ; i++) {
            for (int j = i*i; j < prime.length ; j+=i) {
                prime[j]= true;
            }
        }
    }
}