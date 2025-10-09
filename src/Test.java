import java.util.Scanner;

public class Test {

    /*
    public static void message1() {
        System.out.println("Hej");
    }

    public static int message2() {
        return 2142321321;
    }

    public static String message3(String msg) {
        return msg;
    }

    public static String message4(String msg1, String msg2) {
        return msg1 + " " + msg2;
    }

    public static int num (int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
     */

    public static String a (int number) {
        return ((number > 0)
                ? "Positive"
                : "Negative");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        message1();
        System.out.println(message2());
        System.out.println(message3("Message with parameters"));
        System.out.println(message4("First msg with parameters,", "Second msg with parameters"));
        System.out.println("The max of 3 and 5 is " + Math.max(3,5));
        System.out.println("Enter your first msg");
        String msg1 = scanner.nextLine();
        System.out.println("Enter your second msg");
        String msg2 = scanner.nextLine();
        System.out.println("msg1 = " + msg1 + "\nmsg2 = " + msg2);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();
        System.out.println("The max num is: " + Math.max(a,b));
         */

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(a(number));

    }
}
