package Array.Medium;


//A two-dimensional (2D) matrix is a grid-like data structure that consists of rows and columns
// Each element in the matrix can be accessed using two indices: one for the row and one
// for the column. It is commonly used to represent data in a tabular format, such as images,
// spreadsheets, and mathematical matrices.


public class twoDMatrix {
    // Implementation of a 2D matrix
    private int[][] matrix;
    private int rows;
    private int cols;
    // Constructor to initialize the matrix with given dimensions
    public twoDMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }
    // Method to set a value at a specific position
    public void setValue(int row, int col, int value) {
        if (isValidPosition(row, col)) {
            matrix[row][col] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid position");
        }
    }
    // Method to get a value from a specific position

    public int getValue(int row, int col) {
        if (isValidPosition(row, col)) {
            return matrix[row][col];
        } else {
            throw new IndexOutOfBoundsException("Invalid position");
        }
    }
    // Method to check if a position is valid
    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
    
}
