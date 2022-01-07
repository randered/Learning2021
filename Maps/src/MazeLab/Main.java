package MazeLab;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Maze maze = new Maze();
        maze.readFromFile("D:\\SelfTrainingGenericSoft\\Maps\\src\\MazeLab\\maze.txt");
        int pathLength = maze.findShortestPath(maze.startCell);
        maze.saveResult("D:\\SelfTrainingGenericSoft\\Maps\\src\\MazeLab\\result.txt", pathLength);

    }
}
