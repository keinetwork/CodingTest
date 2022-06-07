import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        List list = new ArrayList<Integer>();
        for (int i = 2; i <= N; i++) {
            boolean check = true;
            double sqrt = Math.sqrt(i);
            ListIterator it = list.listIterator();
            while (it.hasNext()) {
                int sosu = (int) it.next();
                if (i % sosu == 0) {
                    check = false;
                    break;
                }
                if (sosu >= sqrt) break;
            }
            if (check) {
                list.add(i);
                if (i >= M) {
                    bw.write(Integer.toString(i) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}