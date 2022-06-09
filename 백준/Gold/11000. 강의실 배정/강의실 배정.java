import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 강의 갯수

		List<int[]> lectures = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int s = scanner.nextInt(); // 시작시간
			int t = scanner.nextInt(); // 종료 시간

			lectures.add(new int[] { s, t });
		}
		Collections.sort(lectures, (a, b) -> {
			return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
		});

		PriorityQueue<Integer> rooms = new PriorityQueue<>();
		rooms.add(lectures.get(0)[1]);

		for (int i = 1; i < lectures.size(); i++) {
			int[] lec = lectures.get(i);

			if (lec[0] < rooms.peek()) {
				rooms.add(lec[1]);
			} else {
				rooms.poll();
				rooms.add(lec[1]);
			}
		}
		System.out.println(rooms.size());
	}

}
