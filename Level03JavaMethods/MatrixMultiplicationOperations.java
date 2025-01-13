/*
Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices

Write a Method to find the transpose of a matrix
           
Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix
 
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix

*/
import java.util.Random;

public class MatrixMultiplicationOperations {

    // Method to create a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return null;
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        return 0;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverseMatrix(int[][] matrix) {
        int det = determinant(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, no inverse.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;

        return inverse;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create random matrices
        int[][] matrix1 = generateRandomMatrix(2, 2);
        int[][] matrix2 = generateRandomMatrix(2, 2);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        // Matrix Operations
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("Sum of Matrices:");
        printMatrix(sum);

        int[][] difference = subtractMatrices(matrix1, matrix2);
        System.out.println("Difference of Matrices:");
        printMatrix(difference);

        int[][] product = multiplyMatrices(matrix1, matrix2);
        if (product != null) {
            System.out.println("Product of Matrices:");
            printMatrix(product);
        }

        int[][] transposed = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        printMatrix(transposed);

        // Determinant and Inverse of Matrix 1
        int det = determinant(matrix1);
        System.out.println("Determinant of Matrix 1: " + det);

        double[][] inverse = inverseMatrix(matrix1);
        if (inverse != null) {
            System.out.println("Inverse of Matrix 1:");
            for (int i = 0; i < inverse.length; i++) {
                for (int j = 0; j < inverse[i].length; j++) {
                    System.out.print(inverse[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}