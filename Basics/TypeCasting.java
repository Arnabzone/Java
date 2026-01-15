package Basics;

/*
 * Type Conversion (also known as Type Casting) is the process of converting a
 * value from one data type to another.
 * Since Java is strictly typed, you can't always just "move" data between
 * containers if their sizes or types don't match.There are two main types of
 * conversion: Widening and Narrowing.1. Widening Conversion (Implicit)Widening
 * happens automatically when you convert a smaller data type to a larger data
 * type. There is no risk of data loss because the new "container" is bigger
 * than the old one.The order of widening is:byte → short → char → int → long →
 * float → doubleHow it works: You just assign the value directly.
 * Example:
 * int myInt = 9;
 * double myDouble = myInt; // Automatic casting: int to double
 * // Result: 9.0
 * 2. Narrowing Conversion (Explicit)Narrowing happens when you convert a larger
 * data type to a smaller data type. This must be done manually by placing the
 * type in parentheses ( ) because there is a risk of losing information (like
 * losing the decimal points or overflowing the range).How it works: Use the
 * syntax (targetType) value.
 * Example:
 * double myDouble = 9.78;
 * int myInt = (int) myDouble; // Manual casting: double to int
 * // Result: 9 (the .78 is truncated/lost)
 * 3. Comparison TableFeatureWidening (Implicit)Narrowing
 * (Explicit)DirectionSmall $\rightarrow$ LargeLarge $\rightarrow$
 * SmallComplexityAutomatic (by Java)Manual (by Developer)Data LossNonePossible
 * (Truncation or Overflow)Exampleint to doubledouble to int4. Type Promotion in
 * ExpressionsWhen you perform math with different types, Java automatically
 * promotes the smaller types to match the largest type in the expression to
 * maintain precision.Javapublic class ConversionDemo {
 * public static void main(String[] args) {
 * byte b = 42;
 * char c = 'a';
 * short s = 1024;
 * int i = 50000;
 * float f = 5.67f;
 * double d = .1234;
 * 
 * // The result of this expression is promoted to 'double'
 * // because 'double' is the largest type involved.
 * double result = (f * b) + (i / c) - (d * s);
 * 
 * System.out.println("Result: " + result);
 * }
 * }
 * Important Note on charWhile char and int are interchangeable (because char
 * uses Unicode numbers), a char is technically unsigned. Converting a negative
 * int to a char will result in unexpected behavior, so be careful with explicit
 * casting there!
 * 
 */