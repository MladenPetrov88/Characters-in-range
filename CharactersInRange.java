import java.util.Scanner;

public class CharactersInRange {

    public static void printTheCharsBetweenTwoChars(char firstChar, char secondChar) {
        int startCharacter = Math.min(firstChar, secondChar);
        int secondCharacter = Math.max(firstChar, secondChar);

        for (int i = startCharacter + 1; i < secondCharacter; i++) {
            System.out.print((char) i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printTheCharsBetweenTwoChars(firstChar, secondChar);

    }
}
