public class Test {
    long sum(int[] a) {
        long ans = 0;
        if( a.length > 3000000) return 0;
		for(int i : a) {
			if(i<0 || i > 1000000) continue;
			ans += i;
		}
        return ans;
    }
}
