import java.util.Scanner;

public class Task7 {

    public static void rotateMatrix(int[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) { //loop, checks how many elements in first row of matrix, only works if matrix is rectangular because base whole matrix on length of row 1
            for (int row = matrix.length - 1; row >= 0; row--) { //loop, sets start at end with matrix.length - 1 = ex 2 (3 rows) which is the last in 0 counting, row >= 0 and row--: keeps going until reached start

                System.out.print(matrix[row][col] + " ");

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt(); //rows

        System.out.println("Enter number of columns: ");
        int cols = scanner.nextInt(); //columns

        int[][] matrix = new int[rows][cols];

        scanner.nextLine(); //needed to clear leftover newline caused by mixing nextInt and nextLine

        for (int i = 0; i < rows; i++) { //loop, asks for elements in each row depending on how many rows
            System.out.println("Enter elements in row " + (i + 1) + " seperated by commas: ");
            String[] stringArray = scanner.nextLine().split(",+"); //stores the string in stringArray

            for (int j = 0; j < cols; j++) { //loop, converts to int and trims and then adds to matrix
                matrix[i][j] = Integer.parseInt(stringArray[j].trim());
            }
        } //restart to next row until all rows have been filled and added as an array in matrix

        rotateMatrix(matrix); //calls rotateMatrix method to use on matrix and print out rotated matrix

        scanner.close();
        }
    }