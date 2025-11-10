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

        for (int row = 0; row < intArray.length; row++) { //determines how many rows in matrix, iterates through each one
            var pos = row; //create position that resets to value of row every row loop

            for (int i = 0; i < intArray.length; i++) { //iterates through elems in intArray[i]

                if (pos == intArray.length) { //if pos is equal to length(out of bounds) reset pos to 0(index)
                    pos = 0;
                }

                System.out.print(intArray[pos] + " "); //print intArray at index pos

                pos++; //move position one step forward

            }

            System.out.println(); //moves to new line after finishing row

        }

        scanner.close();
    }
}