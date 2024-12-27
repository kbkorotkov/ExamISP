import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String inputString = scanner.nextLine();

            int specialCharCount = countSpecialCharacters(inputString);
            System.out.println("Количество специальных символов: " + specialCharCount);
        }

        public static int countSpecialCharacters(String input) {
            if (input == null || input.isEmpty()) {
                return 0;
            }

            int count = 0;

            for (char c : input.toCharArray()) {
                if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                    count++;
                }
            }

            return count;
        }
}