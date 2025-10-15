import java.util.Scanner;

public class Task7 {

    public static void rotateMatrix(int[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) { //loop over each column of the matrix (using first row length)
            for (int row = matrix.length - 1; row >= 0; row--) { //print elements from bottom to top in current column
                //matrix.length = n of rows in matrix, how many rows - 1 gives last row index because array index start at 0 example: n of rows in m: 4, if -1 = 3 matrix[3][0] is then last number in column 1

                System.out.print(matrix[row][col] + " "); //prints elements of current column from bottom to top on the same line (rotate)

            }

            System.out.println(); //new line after each column elements has been printed on same line (rotate)

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

        System.out.println("Enter matrix (number): ");
        for (int i = 0; i < rows; i++) { //loop, asks for elements in each row depending on how many rows
            String[] stringArray = scanner.nextLine().split(",+"); //stores the string in stringArray

            for (int j = 0; j < cols; j++) { //loop, converts to int and trims and then adds to matrix
                matrix[i][j] = Integer.parseInt(stringArray[j].trim());
            }
        } //restart to next row until all rows have been filled and added as an array in matrix

        rotateMatrix(matrix); //calls rotateMatrix method to use on matrix and print out rotated matrix

        scanner.close();
        }
    }