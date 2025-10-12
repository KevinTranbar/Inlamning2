import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

    public static ArrayList<ArrayList<Integer>> incSubArrays(int[] arr) {

        ArrayList<ArrayList<Integer>> incSubArrays = new ArrayList<>(); //arrayList of arrayLists with int datatype, will hold all arraylists of increasing subarrays
        ArrayList<Integer> subArrays = new ArrayList<>(); //arraylist, will hold temporary list

        for (int i = 0; i < arr.length; i++) { //loop, check for increasing subarray through all index 1 by 1, then add to incSubArrays
            subArrays.clear(); //clear list, prepare for next check
            subArrays.add(arr[i]); //always adds first num (potential increasing subarray)

            while (i + 1 < arr.length && arr[i] < arr[i + 1]) { //loop, first part hinders going past end of array (going out of bounds), second part checks for increasing subarray
                /*
                alternative method - adds first num here if list is empty and then adds the second if subarray is increasing
                if (subArrays.isEmpty()) subArrays.add(arr[i]);
                subArrays.add(arr[i + 1]);
                */
                i++; //skips first num because already added
                subArrays.add(arr[i]); //adds next num if subarray is increasing
            }

            if (subArrays.size() > 1) { //if list is longer than 1 -> add to incSubArrays
                incSubArrays.add(new ArrayList<>(subArrays)); //all increasing subarrays
            }
        }

        return incSubArrays;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of array (numbers) with commas in between: ");
        String[] stringArray = scanner.nextLine().split(",+"); //stores input in stringArray

        int[] intArray = new int[stringArray.length]; //declare intArray with same number of elements as stringArray

        for (int i = 0; i < stringArray.length; i++) { //loops through stringArray - convert to int and store in intArray[i]
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }

        System.out.println("Increasing subarrays are: " + incSubArrays(intArray));

        scanner.close();
    }
}