class Solution {
    	public boolean isNum(int[] array, int key) {
		for(int i=0; i<array.length-1; i++) {
			if(array[i] == key)
				return true;
		}
		return false;
	}
	
	public boolean isBonus(int[] array, int key) {
		for( int c : array ) {
			if(c== key) return true;
		}
		return false;
	}
	
	public int getRank(int corect, int bonus) {
		int rank = 0;
		switch(corect+bonus) {
		case 6: rank = 1;break;
            case 5: rank = 2;break;
		case 4: rank = 3;break;
		case 3: rank = 4;break;
		case 2: rank = 5; break;
		default: rank = 6;break;
		}
		if((corect + bonus) == 6) rank = 1;
		return rank;
	}
    public int[] solution(int[] lottos, int[] win_nums) {
     		int corect = 0;
		int bonus = 0;
		int ably = 0;
		for (int i=0; i<lottos.length; i++) {
			if (isNum(win_nums, lottos[i])) {
				corect++;
			} else if (lottos[i] == 0) {
				ably++;
			}
			
		}
		if( isBonus(lottos, win_nums[5])) {
			bonus++;
		}
		System.out.println(corect+" "+ably+" "+bonus);
		int[] ret = { getRank(corect+ably, bonus), getRank(corect, bonus) };
        return ret;
    }
}