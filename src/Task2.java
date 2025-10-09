import java.util.Scanner;

public class Task2 {

    public static boolean validInvalid(String ssn) { //method to check if ssn is valid
        if ((ssn.length() == 13) && //checks character length
                Character.isDigit(ssn.charAt(0)) && //checks so index 0: 7 and 9 : 12 are digits
                Character.isDigit(ssn.charAt(1)) &&
                Character.isDigit(ssn.charAt(2)) &&
                Character.isDigit(ssn.charAt(3)) &&
                Character.isDigit(ssn.charAt(4)) &&
                Character.isDigit(ssn.charAt(5)) &&
                Character.isDigit(ssn.charAt(6)) &&
                Character.isDigit(ssn.charAt(7)) &&
                Character.isDigit(ssn.charAt(9)) &&
                Character.isDigit(ssn.charAt(10)) &&
                Character.isDigit(ssn.charAt(11)) &&
                Character.isDigit(ssn.charAt(12)) &&
                (ssn.charAt(8) == '-')) { //checks so index 8 is a hyphen
            return true; //if conditions = true -> validInvalid = true
        }
        else return false; //if else -> validInvalid = false
    }

    public static void main(String[] args) { //main execution

        Scanner scanner = new Scanner(System.in);

        do { //main loop - keeps going until break; or System.exit(1);
            System.out.print("Enter your social security number: ");
            String ssn = scanner.nextLine().trim();
            if (!validInvalid(ssn)) { //if not valid -> print
                System.out.println("Invalid social security number");
            } else { //if else -> print
                System.out.println("Valid social security number");
            }
            System.out.print("Enter \"continue\" to continue and \"exit\" to quit: ");
            String selection = scanner.nextLine().trim();

            switch (selection) { //selection - "continue" or "exit"
                case "continue" -> {
                }
                case "exit" -> {
                    System.exit(1); //shut down program - break; -> exits switch, not do-while loop
                }
                default -> {
                    System.out.println("Invalid selection, enter 'continue' to continue and 'exit' to quit");
                    System.exit(1);
                }
            }
        } while (true);

    }
}