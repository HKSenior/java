import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Basics {
    public static void dataTypes() {
        System.out.print("--- This marks the beginning of Data Types\n\n");

        // Data Types
        // There are 8 primitive data type and 1 special reference data type (String)

        /************************************************** Side Note **************************************************
         * Primitive data types are defined by the language while reference data types are user defined. Here are some
         * difference between the two.
         *
         *              Primitive                       |               Reference
         *   Stores data                                |   Stores and address
         *   Can only hold 1 value                      |   Can hold more than 1 value
         *   Uses less memory                           |   Uses more memory
         *   Faster than reference data types           |   Slower compared to primitive data types
         *
         ***************************************************************************************************************/
        // 1 bit has 2 values (0 or 1 / true or false)
        // 1 byte has 8 bits (-128 to 127)

        // Booleans are 1 bit and can only be true or false.
        Boolean a = true;

        // A byte (8 bits) can be used to store ascii letters or numbers.
        byte b = 'c';

        // A short (16 bits / 2 bytes) is used to store whole numbers between -32,768 and 32,767.
        short c = 10000;

        // An int (32 bits / 4 bytes) is used to store whole numbers between -2 billion and 2 billion.
        int d = 16441;

        // A long (64 bits / 8 bytes) is used to store whole numbers between -9 quintillion and 9 quintillion.
        long e = 12564890;

        // A flot (32 bits / 4 bytes) is usually used to store fractional numbers with a precision of 6 - 7 numbers
        // after the decimal.
        float f = 3.1415f;

        // A double (64 bits / 8 bytes) is also used to store fractional numbers but with a 15 digit precision after
        // the decimal.
        double g = 3.141592653589;

        // A char (8 bits / 2 bytes) is usually used to store single characters (Using single quotes).
        char h = 'h';

        // A string doesn't have a set size because it depends on the size of the underlying char array and the
        // encoding used to turn it into bytes.
        String i = "Jake from State Farm";
        System.out.format("i has %d characters.\n", i.length());

        // Convert the string i into different encodings.
        final byte[] utf8bytes = i.getBytes(StandardCharsets.UTF_8);
        final byte[] utf16bytes = i.getBytes(StandardCharsets.UTF_16);

        System.out.format("i in UTF-8 encoding has a size of %d bytes.\n", utf8bytes.length);
        System.out.format("i in UTF-16 encoding has a size of %d bytes.\n", utf16bytes.length);

        System.out.print("\n--- This marks the end of Data Types\n\n");
    }

    public static void userInput() {
        System.out.print("--- This marks the beginning of User Input\n\n");

        // User Input
        // The scanner class is capable of parsing primitive data types and strings using regular expressions. It splits
        // The input into tokens by using a delimiter which is set to whitespace by default.
        Scanner scanner = new Scanner(System.in);

        // The following line will print the string to the console but because this uses the .print method it will not
        // print a new line. Therefore, the user will be able to enter his/her name on the same line.
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is your favorite dish? ");
        String dish = scanner.nextLine();

        System.out.format("Hello, %s of %d years. Your favorite dish is %s.\n", name, age, dish);
        System.out.print("\n--- This marks the end of User Input\n\n");
    }

    public static void main(String[] args) {
        dataTypes();
        userInput();
    }
}
