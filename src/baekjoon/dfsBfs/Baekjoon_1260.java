package baekjoon.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_1260 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());


        Graph graph = new Graph(N);

        for (int i = 0; i < M; i++) {
            token = new StringTokenizer(br.readLine());

            int v1 = Integer.parseInt(token.nextToken());
            int v2 = Integer.parseInt(token.nextToken());

            graph.addEdge(v1, v2);
//            graph.addEdge(v2, v1);
        }

        graph.DFS();
    }

    // 순환 호출 이용 방식
    static class Graph {
        private int V;
        private LinkedList<Integer> adj[];

        /* 생성자 */
        public Graph(int v) {
            V = v;
            adj = new LinkedList[v + 1];
            for (int i = 0; i < v + 1; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        /* 노드 연결*/
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        /* DFS에 의해 사용되는 함수 */
        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;
            System.out.print(v + " ");

            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }

        void DFS(int v) {
            boolean visited[] = new boolean[V + 1];

            DFSUtil(v, visited);
        }

        void DFS() {
            boolean visited[] = new boolean[V + 1];

            for (int i = 1; i < V + 1; i++) {
                if (visited[i] == false)
                    DFSUtil(i, visited);
            }
        }

        void sortAdj() {
            for (int i = 0; i < adj.length; i++) {
                Collections.sort(adj[i]);
            }
        }

    }
}
