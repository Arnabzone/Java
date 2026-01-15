//adj matrix representation of graph
package Graph;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of vertices
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        // Step 2: Declare adjacency matrix
        int[][] adj = new int[V][V];

        // Step 3: Initialize matrix with 0
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                adj[i][j] = 0;
            }
        }

        // Step 4: Read number of edges
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        // Step 5: Read edges
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1;   // remove this line for directed graph
        }

        // Step 6: Print adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Time Complexity: O(V^2) for printing the matrix
// Space Complexity: O(V^2) for storing the adjacency matrix

