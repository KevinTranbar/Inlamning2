import java.util.Scanner;

public class Task2 {

    public static boolean length (String ssn) {

        return ssn.length() == 13; //returns true if length == 13
    }

    public static boolean elems (String ssn) { //checks if ssn has 12 digits and 1 hyphen
        int isDigit = 0;
        int isHyphen = 0;

        for (int i = 0; i < ssn.length(); i++) { //checks through ssn -> adds 1 when char is digit
            if (Character.isDigit(ssn.charAt(i))) {
                isDigit++;
            }

        }

        for (int i = 0; i < ssn.length(); i++) { //checks through ssn -> adds 1 when char is hyphen
            if (ssn.charAt(i) == '-') {
                isHyphen++;
            }
        }

        return isDigit == 12 && isHyphen == 1; //returns true if exactly 12 digits and 1 hyphen
    }

    public static boolean validInvalid (String ssn) { //method to check if ssn is valid or invalid

        return length(ssn) && elems(ssn); //if length and elems is valid -> true
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
                case "exit" ->
                        System.exit(1); //shut down program - break; -> exits switch, not do-while loop

                default -> {
                    System.out.println("Invalid selection, enter 'continue' to continue and 'exit' to quit");
                    System.exit(1);
                }
            }
        } while (true);

    }
}