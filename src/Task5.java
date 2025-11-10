import java.util.Scanner;

public class Task5 {

    public static void incSubArrays(int[] subArray) {

        for (int i = 0; i < subArray.length - 1; i++) { //loop through array, checking for increasing subarrays

            if (subArray[i] < subArray[i + 1]) { //start of an increasing subarray found -> print the first element
                System.out.print("[" + subArray[i]);

                while (i + 1 < subArray.length && subArray[i] < subArray[i + 1]) { //continue while next element is greater -> increment by one(skip first elem in first loop) and print rest elements
                    i++;
                    System.out.print(", " + subArray[i]);
                }

                System.out.print("]");
                System.out.println(); //print newline after finishing the current increasing subarray, only works if subArray is increasing

            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of array (numbers) with commas in between: ");
        String[] stringArray = scanner.nextLine().split(",+"); //stores input in stringArray

        int[] intArray = new int[stringArray.length]; //declare intArray with same number of elements as stringArray

        for (int i = 0; i < stringArray.length; i++) { //loops through stringArray - convert to int and store in intArray[i]
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }

        System.out.println("Increasing subarrays are:");
        incSubArrays(intArray);

    }
}