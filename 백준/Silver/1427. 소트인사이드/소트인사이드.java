import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arry = new int[10];
        char[] N = br.readLine().toCharArray();
        for (int i = 0; i < N.length; i++) {
            arry[N[i] - '0']++;
        }
        for (int i = arry.length - 1; i >= 0; i--) {
            if (arry[i] != 0) {
                for (int j = 0; j < arry[i]; j++) {
                    System.out.print(i);
                }
            }
        }
    }
}