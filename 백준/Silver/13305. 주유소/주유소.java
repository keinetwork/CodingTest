import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] distance;
    static int[] station;
    static class Pos{
        int station;
        int distance;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        distance = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        station = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            station[i] = Integer.parseInt(st.nextToken());
        }

        int index = 0;
        long payed = 0;
        while (index != N-1){
            int next = find(index);
            long dis = 0;
            for (int i = index+1; i <=next ; i++) {
                dis += distance[i];
            }
            payed += dis*station[index];
            index = next;
        }
        System.out.println(payed);
    }
    public static int find(int index){
        for (int i = index+1; i <N ; i++) {
            if(station[index]>station[i]){
                return i;
            }
        }
        return N-1;
    }

}
