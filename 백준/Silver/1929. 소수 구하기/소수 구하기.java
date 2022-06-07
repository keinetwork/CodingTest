import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력값 처리
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = input.readLine();
		StringTokenizer token = new StringTokenizer(s);
		int m = Integer.parseInt(token.nextToken());
		int n = Integer.parseInt(token.nextToken());
		
        List prime = new ArrayList();
		// 1은 소수가 아니므로 2부터 탐색
		for (int i = 2; i <= n; i++) {
			boolean check = true;
			ListIterator it = prime.listIterator();
			while (it.hasNext()) {
        int temp = (int)it.next();
				if (i%temp == 0) {
				    check = false;
				    break;
        }
        if(temp > Math.sqrt(i)){
            break;
        }				
			}
			if(check == true) {
				prime.add(i);
				if(i >= m) {
					System.out.println(i);
				}
			}
		}

	}
}