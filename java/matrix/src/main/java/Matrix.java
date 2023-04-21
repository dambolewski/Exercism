import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Matrix {
    int[][] matrix;
    int rows;
    int cols;

    Matrix(String matrixAsString) {
        rows = matrixAsString.split("\n").length;
        cols = matrixAsString.split("\n")[0].split(" ").length;
        matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String[] numbers = matrixAsString.split("\n")[i].split(" ");
                matrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(j == columnNumber - 1)
                    column[i] = matrix[i][j];
            }
        }
        return column;
    }
}
