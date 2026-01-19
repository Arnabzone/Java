package Graph;

 import java.util.*;

public class BFS {

    // BFS function
    static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V];   // Step 1: visited array
        Queue<Integer> q = new LinkedList<>(); // Step 2: queue

        // Step 3: start BFS
        visited[start] = true;
        q.add(start);

        System.out.print("BFS Traversal: ");

        while (!q.isEmpty()) {
            int node = q.poll();   // remove front element
            System.out.print(node + " ");

            // Step 4: visit all adjacent nodes
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input vertices
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Input edges
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // remove for directed graph
        }

        // Input starting node
        System.out.print("Enter starting vertex for BFS: ");
        int start = sc.nextInt();

        bfs(start, adj, V);
    }
}
// Time Complexity: O(V + E)
// Space Complexity: O(V) for visited array and O(V) for queue