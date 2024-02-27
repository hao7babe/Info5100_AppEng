package edu.neu.mgen;

public class HW7_MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = { {2, 3, 4}, {3, 4, 5} };
        int[][] B = { {1, 2}, {3, 4}, {5, 6} };

        // Check if multiplication is possible
        if (A[0].length != B.length) {
            System.out.println("Matrices cannot be multiplied due to incompatible dimensions.");
            return;
        }

        // Multiply the matrices
        int[][] product = multiplyMatrices(A, B);

        // Print the result
        printMatrix(product);
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsInA = A.length;
        int columnsInA = A[0].length; // same as rows in B
        int columnsInB = B[0].length;
        int[][] product = new int[rowsInA][columnsInB];

        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return product;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
