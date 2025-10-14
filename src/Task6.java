import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array (numbers) with commas in between: ");
        String[] stringArray = scanner.nextLine().split(",+"); //stores input in stringArray

        int[] intArray = new int[stringArray.length]; //declare intArray with same number of elements as stringArray
        int maxElem = Integer.MIN_VALUE; //smallest/largest possible integer to prevent user input workarounds
        int minElem = Integer.MAX_VALUE;

        for (int i = 0; i < stringArray.length; i++) { //loops through stringArray - convert to int and store in intArray[i]
            intArray[i] = Integer.parseInt(stringArray[i].trim());

            if (intArray[i] > maxElem)
                maxElem = intArray[i]; //if element > maxElem -> make maxElem
            if (intArray[i] < minElem)
                minElem = intArray[i]; //if element < minElem -> make minElem

        }

        int [][] matrix = new int[intArray.length][intArray.length]; //creates a matrix with equal rows and columns based intArray length

        for (int row = 0; row < matrix.length; row++) { //determines how many rows in matrix, iterates through each one
           for (int col = 0; col < matrix[row].length; col++) { //for every row, iterate through each element(column) in row
               matrix[row][col] = intArray[row] + col; /* current element in matrix at row/col, intArray[row] is the value of user input at intArray index[row] - example:
                                                                                                                                                    input: 1, 2, 3
                                                                                                                                                    first loop:
                                                                                                                                                    intArray[0] = 1
                                                                                                                                                    so in first loop:
                                                                                                                                                    1 + 0 = 1 for matrix[0][0]
                                                                                                                                                    or matrix [row][col] loop 1 */
               if (matrix[row][col] > maxElem) { //if current elem > maxElem
                   matrix[row][col] = minElem + (matrix[row][col] - maxElem - 1); //make current elem = minElem (calculations) and increment from there on to next value < maxElem
               }

               System.out.print(matrix[row][col] + " "); //prints all elements in row, once a loop

           }

           System.out.println(); //moves to new line after finishing row

       }

        scanner.close();
    }
}