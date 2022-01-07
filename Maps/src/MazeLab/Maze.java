package MazeLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {
    private char[][] maze;
    private int size;
    public Cell startCell = null;

    public int findShortestPath(Cell startCell) {

        if (startCell == null) {
            // Start cell is missing -> no path
            return -1;
        }

        // Queue for traversing the cells in the maze
        Queue<Cell> visitedCells = new LinkedList<Cell>();
        visitCell(visitedCells, startCell.getRow(), startCell.getColumn(), 0);

        while (! visitedCells.isEmpty()) {
            Cell currentCell = visitedCells.remove();
            int row = currentCell.getRow();
            int col = currentCell.getColumn();
            int distance = currentCell.getDistance();
            if ((row == 0) || (row == size-1) || (col == 0) || (col == size-1)) {
                // We are at the maze border
                return distance + 1;
            }
            visitCell(visitedCells, row, col + 1, distance + 1);
            visitCell(visitedCells, row, col - 1, distance + 1);
            visitCell(visitedCells, row + 1, col, distance + 1);
            visitCell(visitedCells, row - 1, col, distance + 1);
        }
        // We didn't reach any cell at the maze border -> no path
        return -1;
    }



    private void visitCell(Queue<Cell> visitedCells,
                           int row, int col, int distance) {
        if (maze[row][col] != 'x') {
            // Cell is free. Visit it
            maze[row][col] = 'x';
            Cell cell = new Cell(row, col, distance);
            visitedCells.add(cell);
        }
    }

    public void readFromFile(String fileName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            this.size = scanner.nextInt();
            scanner.nextLine();
            this.maze = new char[this.size][this.size];

            for (int row = 0; row < this.size; row++) {
                String line = scanner.nextLine();
                for (int col = 0; col < line.length(); col++) {
                    char ch = line.charAt(col);
                    maze[row][col] = ch;
                    if (ch == '*') {
                        this.startCell = new Cell(row, col, 0);
                    }
                }
            }
        }
    }

    public void saveResult(String fileName, int result)
            throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("" + result);
        }

    }
}
