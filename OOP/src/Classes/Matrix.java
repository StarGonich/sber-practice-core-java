package Classes;

public class Matrix {
    private final double[][] matrix;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public void setValue(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            matrix[i][j] = value;
        } else {
            System.out.println("Неверные индексы");
        }
    }

    public void add(Matrix otherMatrix) {
        if (this.rows == otherMatrix.rows && this.columns == otherMatrix.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    this.matrix[i][j] += otherMatrix.matrix[i][j];
                }
            }
        } else {
            System.out.println("Матрицы разных размеров");
        }
    }

    public static Matrix addition(Matrix matrix1, Matrix matrix2) {
        if (matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns) {
            System.out.println("Несоответствие размеров для сложения матриц");
            return null;
        }

        Matrix result = new Matrix(matrix1.rows, matrix2.columns);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.columns; j++) {
                result.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }

        return result;
    }
    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] *= scalar;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Matrix multiplication(Matrix matrix1, Matrix matrix2) {
        if (matrix1.columns != matrix2.rows) {
            System.out.println("Несоответствие размеров для умножения матриц");
            return null;
        }

        Matrix result = new Matrix(matrix1.rows, matrix2.columns);

        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix2.columns; j++) {
                for (int k = 0; k < matrix1.columns; k++) {
                    result.matrix[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Matrix mat1 = new Matrix(2, 3);
        Matrix mat2 = new Matrix(3, 6);
        multiplication(mat1, mat2).print();
    }
}
