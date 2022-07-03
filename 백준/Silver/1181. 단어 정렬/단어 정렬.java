import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main implements Comparable<Main> {
    public String word;

    public Main(String w) {
        this.word = w;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<Main> map = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            map.add(new Main(br.readLine()));
        }
        Iterator<Main> itr = map.iterator();
        while (itr.hasNext()) {
            bw.write(itr.next().word);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    @Override
    public int compareTo(Main o) {
        if (this.word.length() == o.word.length())
            return this.word.compareTo(o.word);
        return this.word.length() - o.word.length();
    }
}