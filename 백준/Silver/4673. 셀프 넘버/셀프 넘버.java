import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> ans = new ArrayList<>();
		for (Integer i = 1; i <= 10000; i++) {
			ans.add(i);
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			int val = i;
			String str = Integer.toString(i);
			for (int j = 0; j < str.length(); j++) {
				val += (int) (str.charAt(j) - '0');
			}
			list.add(val);
		}

		list.forEach(l -> ans.remove(l));

		StringBuffer sb = new StringBuffer();
		ans.forEach(a -> sb.append(a + "\n"));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}