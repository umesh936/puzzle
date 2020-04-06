package umesh.backtracking;

/**
 * <pre>
 *
 *     A Maze is given as N*N binary matrix of blocks where source block is the upper
 *     left most block i.e., maze[0][0] and destination block is lower rightmost block
 *     i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination.
 *     The rat can move only in two directions: forward and down.
 *     In the maze matrix, 0 means the block is a dead end and 1 means the block can be used in
 *     the path from source to destination.
 *     Note that this is a simple version of the typical Maze problem.
 *     For example, a more complex version can be that the rat can move in 4 directions
 *     and a more complex version can be with a limited number of moves.
 *
 * Following is an example maze.
 *                  {1, 0, 0, 0}
 *                 {1, 1, 0, 1}
 *                 {0, 1, 0, 0}
 *                 {1, 1, 1, 1}
 * </pre>
 */
public class MazePath {

    // Size of the maze
    static int N;

    static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { System.out.print(" " + sol[i][j] + " "); }
            System.out.println();
        }
    }

    public static boolean findPath(int MAZE[][], int row, int col, int[][] sol) {

        if (row == MAZE.length - 1 && col == MAZE.length - 1 && MAZE[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }
        if (row > MAZE.length - 1 || col > MAZE.length - 1 || MAZE[row][col] == 0) {
            return false;
        }
        sol[row][col] = 0;
        if (findPath(MAZE, row + 1, col, sol)) {
            sol[row][col] = 1;
            return true;
        }
        if (findPath(MAZE, row, col + 1, sol)) {
            sol[row][col] = 1;
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int MAZE_WITH_NO_SOLUTION[][] = new int[][]
            {
                {1, 1, 0},
                {1, 1, 1},
                {1, 0, 0}
            };
        N = MAZE_WITH_NO_SOLUTION.length;
        int sol[][] = new int[N][N];
        System.out.println("-- MAZE 1 with no solution -- ");
        if (findPath(MAZE_WITH_NO_SOLUTION, 0, 0, sol)) {
            printSolution(sol);
        }
        else {
            System.out.println("There is no solution.");
        }

        int MAZE[][] = new int[][]
            {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};
        N = MAZE.length;
        int sol1[][] = new int[N][N];
        System.out.println("-- MAZE 1 with solution -- ");
        if (findPath(MAZE, 0, 0, sol1)) {
            printSolution(sol1);
        }
        else {
            System.out.println("There is no solution.");
        }
    }
}
