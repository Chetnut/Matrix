
import java.io.*;
import java.util.*;

public class MatrixTool {
    public static void main(String[] args) throws IOException {
        int[][] matrix1, matrix2;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter an integer (matrix size) or two filenames:\n> ");
        
        if (scnr.hasNextInt()) {
            int size = scnr.nextInt();
            matrix1 = MatrixUtil.generateRandomMatrix(size);
            matrix2 = MatrixUtil.generateRandomMatrix(size);
            MatrixUtil.writeMatrixToFile(matrix1, "matrix1.txt");
            MatrixUtil.writeMatrixToFile(matrix2, "matrix2.txt");
            System.out.println("Generated matrix1.txt and matrix2.txt");
        } else {
            String file1 = scnr.next();
            String file2 = scnr.next();
            matrix1 = MatrixUtil.readMatrixFromFile(file1);
            matrix2 = MatrixUtil.readMatrixFromFile(file2);
        }

        int[][] result = MatrixUtil.multiplyMatrices(matrix1, matrix2);
        MatrixUtil.writeMatrixToFile(result, "matrix3.txt");
        System.out.println("Result saved to matrix3.txt");
    }
}


