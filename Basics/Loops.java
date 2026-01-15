package Basics;

public class Loops {

    // ifelse
int score = 85;

    if(score>=90)
    {
        System.out.println("Grade: A");
    }else if(score>=80)
    {
        System.out.println("Grade: B"); // This will execute
    }else if(score>=70)
    {
        System.out.println("Grade: C");
    }else
    {
        System.out.println("Grade: F");
    }

    // nested if
    boolean hasLibraryCard = true;
    int fines = 0;

    if(hasLibraryCard)
    {
        if (fines == 0) {
            System.out.println("You can borrow a book!");
        } else {
            System.out.println("Please pay your fines first.");
        }
    }

    // ternary
Java has a"one-liner"
    version of if-else
    called the
    Ternary Operator.
    It is useful for
    simple assignments.Syntax:variable=(condition)?valueIfTrue:valueIfFalse;
    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";System.out.println(result); // Outputs "Good evening."

}