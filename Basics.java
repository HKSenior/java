import java.nio.charset.StandardCharsets;
import java.util.Random;
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
         **************************************************************************************************************/
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

    public static int userInput(Scanner scanner) {
        System.out.print("--- This marks the beginning of User Input\n\n");

        // User Input
        // The following line will print the string to the console but because this uses the .print method it will not
        // print a new line. Therefore, the user will be able to enter his/her name on the same line.
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is your favorite dish? ");
        String dish = scanner.nextLine();

        /************************************************** Side Note **************************************************
         * In the code above you'll see scanner.nextLine() was called again after .nextInt(). Why is that? Well there
         * is a small caveat when reading in numbers (integers/doubles) then strings. When the first .nextLine() was
         * called the function uses the newline character (/n) as the delimiter. This means java can determine it has
         * processed a full line once it comes across the new line character. For numbers, it's a little different. Java
         * stops reading once it encounters a non-numerical character. Therefore, when you enter your age and press
         * enter java doesn't remove the newline character and the end of your input because the "/" would be considered
         * non-numerical. Which is why the following .nextLine() is important. This call essentially clears the input
         * by removing the trailing newline character.
         **************************************************************************************************************/

        System.out.format("Hello, %s of %d years. Your favorite dish is %s.\n", name, age, dish);
        System.out.print("\n--- This marks the end of User Input\n\n");
        return age;
    }

    public static void expressions() {
        System.out.print("--- This marks the beginning of Expressions\n\n");

        // Expressions are made up of operands and operators
        // operands are values and variables
        // operators are +, -, /, *, %, ++, --, +=, -=, /=, *=

        int friends = 10;

        System.out.format("We have %d friends.\n", friends);
        System.out.format("We are gaining one friend so we now have %d friends.\n", friends += 1);
        System.out.format("We are losing two friend so we now have %d friends.\n", friends -= 2);
        System.out.format("We are gaining 3 times as many friends, so we now have %d friends.\n", friends *= 3);
        System.out.format("We are losing half of our friends, so we now have %d friends.\n", friends /= 2);
        System.out.format("We are gaining one more friend on the next print, be we have %d friends.\n", friends++);
        System.out.format("We now have %d friends.\n", friends);

        /************************************************** Side Note **************************************************
         * % is the remainder operator (also called modulus)
         * ++ is incremental
         * -- is decremental
         *
         * One thing to take note off when dealing with the incremental and decremental operators is that there is a
         * difference between ++friends and friends++. These are called pre-incremental and post-incremental
         * respectfully. Pre-incremental adds 1 to the variable before returning the value where are post-incremental
         * adds 1 after returning the variable. The same goes for the decremental operator.
         **************************************************************************************************************/

        System.out.print("\n--- This marks the end of Expressions\n\n");
    }

    public static void math() {
        System.out.print("--- This marks the beginning of Math\n\n");

        double x = 3.1415;
        double y = -10;

        System.out.format("The maximum between %f and %f is %f.\n", x, y, Math.max(x, y));
        System.out.format("The absolute value of %f is %f.\n", y, Math.abs(y));
        System.out.format("The square root of 25 is %f.\n", Math.sqrt(25));
        System.out.format("The closest whole number to %f is %d.\n", x, Math.round(x));
        System.out.format(
                "The ceiling (round up) of %f is %f and the floor (round down) is %f.\n",
                x,
                Math.ceil(x),
                Math.floor(x));

        System.out.print("\n--- This marks the end of Math\n\n");
    }

    public static void random() {
        System.out.print("--- This marks the beginning of Random\n\n");

        // The following class doesn't generate true random numbers but instead generates pseudo random numbers.
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        Boolean y = random.nextBoolean();
        Double z = random.nextDouble();

        System.out.format("The generated random integer is %d.\n", x);
        System.out.format("The generated random boolean is %b.\n", y);
        System.out.format("The generated random double is %f.\n", z);

        System.out.print("\n--- This marks the end of Random\n\n");
    }

    public static void flowControl(int age) {
        System.out.print("--- This marks the beginning of Flow Control\n\n");

        /*********************************************** Flow Control **************************************************
         * 1) If Statements
         *      If statements will run a block of code if the condition given evaluates to true. You can use an if-else
         *      block when you need another block of code to run when the condition is not true. Therefore, you can
         *      use a series of if-else-if statements to create custom logic.
         * 2) Switch Statements
         *      Switch statements allow you to test a variable against a list of values. This method is usually
         *      preferred if you have too many if-else-if statements.
         * 3) Ternary Operator
         *      This operator is used as follows:
         *          condition ? when_true : when_false
         *      For example:
         *          int age = 19;
         *          System.out.println(age >= 18 ? "Adult" : "Not an adult");
         **************************************************************************************************************/

        // If-else-if statements
        if (age >= 75) {
            System.out.println("Ok Boomer!!!");
        } else if (age >= 18) {
            System.out.println("Congratulations, you are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not an adult");
        }

        // Switch statements
        String day = "Friday";
        switch (day) {
            case "Sunday" -> System.out.println("Today is a day of rest");
            case "Saturday" -> System.out.println("Today is Saturday");
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("Today is a day of the week");
            default -> System.out.println("Invalid day");
        }

        // Ternary Operator
        System.out.println(age >= 18 ? "Adult" : "Not an adult");

        System.out.print("\n--- This marks the end of Flow Control\n\n");
    }

    public static void logicalOperators(Scanner scanner) {
        System.out.print("--- This marks the beginning of Logical Operators\n\n");

        /*
         * Logical operators are used to connect two or more expressions.
         *      && = (AND) both conditions must be true
         *      || = (OR) either condition must be true
         *      ! = (NOT) reverses boolean value
         */
        System.out.println("You are now playing a game!!!");
        System.out.println("Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You have quit the game :)");
        } else {
            System.out.println("You've decided to continue playing the game :)");
        }

        System.out.print("\n--- This marks the end of Logical Operators\n\n");
    }

    public static void main(String[] args) {
        // The scanner class is capable of parsing primitive data types and strings using regular expressions. It splits
        // The input into tokens by using a delimiter which is set to whitespace by default.
        Scanner scanner = new Scanner(System.in);

        dataTypes();
        int age = userInput(scanner);
        expressions();
        math();
        random();
        flowControl(age);
        logicalOperators(scanner);

        scanner.close();
    }
}
