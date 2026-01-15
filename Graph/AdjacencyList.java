package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of vertices
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        // Step 2: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Step 3: Initialize list for each vertex
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 4: Read number of edges
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        // Step 5: Read edges
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);   // remove this line for directed graph
        }

        // Step 6: Print adjacency list
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}


// Time Complexity: O(V + E) for printing the list
// Space Complexity: O(V + E) for storing the adjacency list

