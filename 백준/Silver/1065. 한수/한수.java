import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static boolean hansu(int n, List<Integer> arr) {
		int su1 = n % 10;
		int su2 = n / 10;

		if (su2 != 0) {
			hansu(su2, arr);
		}
		arr.add(su1);

		if (arr.size() < 3)
			return true;

		if (arr.get(0) - arr.get(1) == arr.get(1) - arr.get(arr.size() - 1))
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		if (N > 1000)
			N = 0;

		int count = 0;
		for (int i = 1; i <= N; i++) {
			List<Integer> ans = new ArrayList<>();
			if (hansu(i, ans))
				count++;
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}