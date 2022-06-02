import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            char[] word = br.readLine().toCharArray();
            if (checkGroup(word))
                result++;
        }
        System.out.println(result);
    }

    private static boolean checkGroup(char[] word) {
        boolean[] alphabet = new boolean[26];

        char pre = 0;
        for (char w : word) {
            if (pre != w && alphabet[w - 'a'])
                return false;
            pre = w;
            alphabet[w - 'a'] = true;
        }

        return true;
    }
}