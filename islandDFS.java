class Graph {
    int ROW, COL;
    int[][] graph;

    Graph(int row, int col, int[][] g) {
        ROW = row;
        COL = col;
        graph = g;
    }

    boolean isSafe(int i, int j, boolean[][] visited) {
        return (i >= 0 && i < ROW &&
                j >= 0 && j < COL &&
                !visited[i][j] && graph[i][j] == 1);
    }

    void DFS(int i, int j, boolean[][] visited) {
        int[] rowNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1};

        visited[i][j] = true;

        for (int k = 0; k < 8; k++) {
            if (isSafe(i + rowNbr[k], j + colNbr[k], visited)) {
                DFS(i + rowNbr[k], j + colNbr[k], visited);
            }
        }
    }

    int countIslands() {
        boolean[][] visited = new boolean[ROW][COL];
        int count = 0;

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    DFS(i, j, visited);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 1, 0, 0, 0},
                         {0, 1, 0, 0, 1},
                         {1, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0},
                         {1, 0, 1, 0, 1}};

        int row = graph.length;
        int col = graph[0].length;

        Graph g = new Graph(row, col, graph);

        System.out.println("Number of islands is:");
        System.out.println(g.countIslands());
    }
}