package MazeLab;

public class Cell {
    private int row;
    private int column;
    private int distance;

    public Cell(int row, int column, int distance) {
        this.row = row;
        this.column = column;
        this.distance = distance;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
