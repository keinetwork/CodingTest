import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[] word;
    static class Position {
        int left;
        int right;
        public Position(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            word = br.readLine().toCharArray();
            Position pos = new Position(0, word.length - 1);
            if (check(pos)) {
                System.out.println(0);
            } else {
                if (check(new Position(pos.left + 1, pos.right)) ||
                        check(new Position(pos.left, pos.right - 1))) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }

    private static boolean check(Position pos) {
        while (pos.left<=pos.right) {
            if (word[pos.left]== word[pos.right]) {
                pos.left++;
                pos.right--;
            } else {
                return false;
            }
        }
        return true;
    }
}