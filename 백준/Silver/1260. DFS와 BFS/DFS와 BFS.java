import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N, M, start;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        visited = new boolean[N+1];
        dfs(start);
        sb.append("\n");
        visited = new boolean[N+1];
        bfs(start);

        System.out.println(sb);
    }

    private static void dfs(int node) {
        visited[node] = true;
        sb.append(node +" ");
        for (int i = 1; i <= N; i++) {
            if(graph[node][i]== 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> needVisit = new LinkedList<>();
        int visitNode;

        needVisit.add(node);
        visited[node]=true;
        sb.append(node+" ");
        while (!needVisit.isEmpty()) {
            visitNode = needVisit.poll();
            for (int i = 1; i <=N ; i++) {
                if((graph[visitNode][i]==1)&& !visited[i]){
                    needVisit.add(i);
                    visited[i] = true;
                    sb.append(i +" ");
                }
            }
        }
    }
}