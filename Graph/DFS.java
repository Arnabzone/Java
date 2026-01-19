package Graph;

import java.util.*;

public class DFS {

    // DFS recursive function
    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        // Mark current node as visited
        visited[node] = true;
        System.out.print(node + " ");

        // Visit all unvisited neighbors
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);   // remove for directed graph
        }

        boolean[] visited = new boolean[V];

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();

        System.out.print("DFS Traversal: ");
        dfs(start, adj, visited);
    }
}

// Time Complexity: O(V + E)
// Space Complexity: O(V) for visited array and O(V) for recursion stack