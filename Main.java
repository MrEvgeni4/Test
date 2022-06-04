import java.util.Scanner;

    public class Main {

        static Scanner scanner = new Scanner(System.in);
        static char operation;
        static String first;
        static String second;
        static String result;

        public static void main(String[] args) {
            Calculated c = new Calculated();
            System.out.println("Введите строку с операцией:");
            String userInput = scanner.nextLine();
            char[] user_char = new char[40];

            for (int i = 0; i < userInput.length(); i++) {
                user_char[i] = userInput.charAt(i);

            }
                String userCharString = String.valueOf(user_char);
                String[] part = userCharString.split("[\"]");
                int mass = part.length;

                if (mass > 3) {
                    String symbol00 = part[1];
                    symbol00 = symbol00.trim();

                    String symbol01 = part[3];
                    symbol01 = symbol01.trim();

                    String symbol02 = part[2];
                    symbol02 = symbol02.trim();

                    first = symbol00;
                    second = symbol01;
                    operation = symbol02.charAt(0);
                    result = c.calculated(first, second, operation);
                    System.out.println("\"" + result + "\"");
                } else {
                    String symbol00 = part[1];
                    symbol00 = symbol00.trim();
                    String part_v2 = part[2];
                    part_v2 = part_v2.trim();
                    char[] arrayPart2 = part_v2.toCharArray();
                    String part2Str = String.valueOf(arrayPart2);
                    for (int v = 0; v < part2Str.length(); v++) {
                        arrayPart2[v] = part2Str.charAt(v);
                        if (arrayPart2[v] == '+') {
                        operation = '+';
                        }
                        if (arrayPart2[v] == '-') {
                        operation = '-';
                        }
                        if (arrayPart2[v] == '*') {
                        operation = '*';
                        }
                        if (arrayPart2[v] == '/') {
                        operation = '/';
                        }
                    }
                    String[] p2s = part2Str.split("[*/+-]");
                    String symbol1 = p2s[1];
                    symbol1 = symbol1.trim();
                    first = symbol00;
                    second = symbol1;
                    result = c.calculated(first, second, operation);

                    System.out.println("\"" + result + "\"");
                    }

                }

}
