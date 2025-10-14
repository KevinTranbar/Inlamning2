import java.util.Scanner;

public class Task1 {

    public static String capitalize(String sentence) { //method to capitalize sentence

        return sentence.toUpperCase();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println(capitalize(sentence)); //uses capitalize method to capitalize user input (sentence)

        scanner.close();
    }
}