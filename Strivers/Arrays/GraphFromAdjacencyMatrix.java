import java.util.ArrayList;
import java.util.List;

public class GraphFromAdjacencyMatrix {

    public static List<Integer> createGraph(int[][] adjMatrix) {
        List<Integer> vertices = new ArrayList<>();
        List<int[]> edges = new ArrayList<>();
        int noOfVertices = adjMatrix.length;

        for (int i = 0; i < noOfVertices; i++) {
            if (adjMatrix[i].length != noOfVertices) {
                System.out.println("False Adjacency Matrix");
                return null;
            }
            vertices.add(i);
            for (int j = 0; j < noOfVertices; j++) {
                if (adjMatrix[i][j] == 1) {
                    edges.add(new int[]{i, j});
                }
            }
        }

        // Printing vertices and edges (optional)
        System.out.println("Vertices: " + vertices);
        for (int[] edge : edges) {
            System.out.println(edge[0] + " -> " + edge[1]);
        }

        return vertices;
    }

    public static void main(String[] args) {
        int[][] adjMatrix = {
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 0, 1, 0}
        };

        List<Integer> vertices = createGraph(adjMatrix);
        if (vertices != null) {
            int noOfVertices = vertices.size();
            int[][] graph = new int[noOfVertices][noOfVertices];
            for (int[] edge : adjMatrix) {
                graph[edge[0]][edge[1]] = 1;
                graph[edge[1]][edge[0]] = 1;
            }

            System.out.println("\nGraph Visualization:");
            for (int i = 0; i < noOfVertices; i++) {
                for (int j = 0; j < noOfVertices; j++) {
                    System.out.print(graph[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}