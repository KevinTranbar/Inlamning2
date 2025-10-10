import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] age = new int [10]; //max 10 integers
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;

        System.out.println("Enter 10 people's age: ");
        for (int i = 0; i < age.length; i++) { //loops input into age[i]
            age[i] = scanner.nextInt();

            if (age[i] < 18) { //checks the different ages and sorts into groups
                group1++;
            } else if (age[i] <= 65) {
                group2++;
            } else group3++;

        }

        System.out.println("<18: " + group1 + " people");
        System.out.println("18-65: " + group2 + " people");
        System.out.println("<65: " + group3 + " people");

    }
}