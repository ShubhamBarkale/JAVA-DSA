public class PrettyPrinting {
    public static void main(String[] args) {

        float a = 453.677738f;

        // printf() -> Used for formatted printing.
        // Syntax:
        // System.out.printf("format string", values);

        // %.2f
        // %  -> Start of placeholder
        // .2 -> Print only 2 digits after decimal point
        // f  -> Floating point number (float/double)

        System.out.printf("Formatted number is %.2f", a);
        // Output:
        // Formatted number is 453.68

        System.out.println("");

        // Math.PI returns the value of PI.
        // println() prints the complete value.

        System.out.println(Math.PI);
        // Output:
        // 3.141592653589793

        System.out.println("");

        // %.3f -> Print only 3 digits after decimal.

        System.out.printf("PI: %.3f", Math.PI);
        // Output:
        // PI: 3.142

        System.out.println("");

        // %s -> Placeholder for Strings.
        // First %s  -> replaced by "shubham"
        // Second %s -> replaced by "God"

        System.out.printf(
                "Hello my name is %s and I am %s",
                "shubham",
                "God"
        );

        // Output:
        // Hello my name is shubham and I am God

        System.out.println("");
    }
}

/*
===================== PLACEHOLDERS =====================

%d  -> Integer
Example:
System.out.printf("%d", 25);

%f  -> Floating Point Number
Example:
System.out.printf("%f", 12.3456);

%.2f -> Floating Point with 2 decimal places
Example:
System.out.printf("%.2f", 12.3456);

%c  -> Character
Example:
System.out.printf("%c", 'A');

%s  -> String
Example:
System.out.printf("%s", "Shubham");

%b  -> Boolean
Example:
System.out.printf("%b", true);

%x  -> Hexadecimal (lowercase)
Example:
System.out.printf("%x", 255); // ff

%X  -> Hexadecimal (uppercase)
Example:
System.out.printf("%X", 255); // FF

%o  -> Octal
Example:
System.out.printf("%o", 15); // 17

%e  -> Scientific notation
Example:
System.out.printf("%e", Math.PI);

%E  -> Scientific notation (uppercase)

%%  -> Prints % symbol
Example:
System.out.printf("90%%");

%n  -> New Line (better than \n in printf)

========================================================
*/

/*
===================== GENERAL SYNTAX ====================

%[flags][width][.precision]type

Examples:

%.2f
%      -> Start of placeholder
.2     -> Precision (2 decimal places)
f      -> Floating point number

%10s
10     -> Reserve 10 spaces for the String

%-10s
-      -> Left align inside 10 spaces

%05d
0      -> Fill remaining spaces with zeros
5      -> Total width = 5

=========================================================
*/