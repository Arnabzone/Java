package Basics;
/* 

In Java, data types are divided into two main categories: Primitive and Non-Primitive (Reference) types. They determine the size and type of values that can be stored in a variable.

1. Primitive Data Types
Java has 8 primitive data types that are built into the language. They are stored directly in the "stack" memory, making them very fast.

Integer Types (Whole Numbers)
Type,Size,Range,Use Case
byte,1 byte,-128 to 127,Saving memory in large arrays.
short,2 bytes,"-32,768 to 32,767",Rare; used for small ranges.
int,4 bytes,≈± 2 Billion,Default for whole numbers.
long,8 bytes,≈± 9 Quintillion,"Large IDs, timestamps (add L suffix)."

Floating-Point Types (Decimals)
Type,Size,Precision,Use Case
float,4 bytes,6–7 digits,Memory saving (add f suffix).
double,8 bytes,15–16 digits,Default for math/scientific decimals.

char: 2 bytes. Stores a single Unicode character (e.g., 'A', '\u0041').

boolean: Size depends on JVM (usually 1 bit). Stores true or false.

2. Non-Primitive (Reference) Data Types
These refer to objects rather than raw values. They are stored in "heap" memory, and the variable holds the address (reference) where the data is located.

Strings: A sequence of characters (e.g., "Hello").

Arrays: Collections of data (e.g., int[] numbers = {1, 2, 3}).

Classes & Interfaces: User-defined types.

Note: Primitive types always have a default value (like 0 or false), while Non-primitive types can be null.
*/

public class Datatypes {
    public static void main(String[] args) {
        // Primitives
        int followers = 1500;
        long totalViews = 10000000000L; // L is required for long
        double price = 19.99;
        float weight = 70.5f; // f is required for float
        char grade = 'A';
        boolean isComplete = false;

        // Non-Primitive (Reference)
        String name = "Gemini";
        int[] scores = { 90, 85, 88 };

        System.out.println("Name: " + name + " | Followers: " + followers);
    }
}