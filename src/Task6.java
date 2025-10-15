import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array (numbers) with commas in between: ");
        String[] stringArray = scanner.nextLine().split(",+"); //stores input in stringArray

        int[] intArray = new int[stringArray.length]; //declare intArray with same number of elements as stringArray

        for (int i = 0; i < stringArray.length; i++) { //loops through stringArray - convert to int and store in intArray[i]
            intArray[i] = Integer.parseInt(stringArray[i].trim());

        }

        int [][] matrix = new int[intArray.length][intArray.length]; //creates a matrix with equal rows and columns based intArray length

        for (int row = 0; row < matrix.length; row++) { //determines how many rows in matrix, iterates through each one
            for (int col = 0; col < matrix[row].length; col++) { //for every row, iterate through each element(column) in row

                if (row > 0) { //after first row, set current elem to next elem in prior row
                    intArray[col] = matrix[row - 1][(col + 1) % matrix[row].length]; //warp around to column 0(index(0)) if goes past current row length

                }

                matrix[row][col] = intArray[col]; //set current elem in matrix to value from intArray at same column

                System.out.print(matrix[row][col] + " "); //print current elem in matrix in current row

            }

            System.out.println(); //moves to new line after finishing row

        }

        scanner.close();
    }
}