package GraphBFS;

public class LargestConnectedNumber {
    static int rows = 6;
    static int columns = 8;
    static int COUNT;
    static final int[][] visited = new int[rows][columns];
    static final int[][] gridResult = new int[rows][columns];

    public static void main(String[] args) {
        int[][] input = {
                {1, 3, 2, 2, 2, 4, 3, 1},
                {3, 3, 3, 3, 3, 3, 1, 1},
                {3, 2, 1, 1, 2, 3, 2, 1},
                {3, 3, 3, 1, 2, 2, 2, 2},
                {1, 1, 3, 3, 3, 3, 3, 3},
                {1, 1, 3, 1, 1, 4, 4, 4}
        };
        computeLargestConnectedGrid(input);
    }

    static boolean validCheck(int row, int col, int key, int[][] grid) {
        if (row < rows && col < columns && row >= 0 && col >= 0) {
            if(visited[col][row] == 0 && grid[row][col] == key){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    static void BFS(int x, int y, int i,
                    int j, int[][] input)
    {
        // terminating case for BFS
        if (x != y)
            return;

        visited[i][j] = 1;
        COUNT++;

        // x_move and y_move arrays
        // are the possible movements
        // in x or y direction
        int[] x_move = { 0, 0, 1, -1 };
        int[] y_move = { 1, -1, 0, 0 };

        // checks all four points
        // connected with input[i][j]
        for (int u = 0; u < 4; u++)
            if ((validCheck(i + y_move[u],
                    j + x_move[u], x, input)) == true)
                BFS(x, y, i + y_move[u],
                        j + x_move[u], input);
    }


    static void reset_visited() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                visited[i][j] = 0;
    }

    static void reset_result(int key, int[][] grid) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (visited[i][j] == 1 &&
                        grid[i][j] == key)
                    gridResult[i][j] = visited[i][j];
                else
                    gridResult[i][j] = 0;
            }
        }
    }

    static void print_result(int res) {
        System.out.println("The largest connected " +
                "component of the grid is :" + res);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (gridResult[i][j] != 0)
                    System.out.print(gridResult[i][j] + " ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    static void computeLargestConnectedGrid(int[][] grid) {
        int current_max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                reset_visited();
                COUNT = 0;

                // checking cell to the right
                if (j + 1 < columns)
                    BFS(grid[i][j], grid[i][j + 1],
                            i, j, grid);

                // updating result
                if (COUNT >= current_max) {
                    current_max = COUNT;
                    reset_result(grid[i][j], grid);
                }
                reset_visited();
                COUNT = 0;

                // checking cell downwards
                if (i + 1 < rows)
                    BFS(grid[i][j],
                            grid[i + 1][j], i, j, grid);

                // updating result
                if (COUNT >= current_max) {
                    current_max = COUNT;
                    reset_result(grid[i][j], grid);
                }
            }
        }
        print_result(current_max);
    }
}
