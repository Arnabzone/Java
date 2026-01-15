package Basics;

public class LoopsTwo {

    /*
     * 1. The Switch Statement
     * Instead of writing many else if blocks, you can use switch. It’s like a menu:
     * it compares a variable against a list of "cases."
     * 
     * case: The value you are checking for.
     * 
     * break: This is crucial. It stops the code from "falling through" to the next
     * case.
     * 
     * default: Runs if none of the cases match (like the else block).
     */
    int day = 3;switch(day)
    {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday"); // This will execute
        break;
    default:
        System.out.println("Invalid day");
}

    /*
     * While Loop
     * A while loop repeats a block of code as long as a condition is true. It
     * checks the condition before running the code.
     */
    int count = 1;while(count<=5)
    {
        System.out.println("Count is: " + count);
        count++; // If you forget this, the loop runs forever!
    }
    /*
     * Do-While Loop
     * The do-while loop is a variant of the while loop. It executes the code block
     * once before checking the condition. This guarantees the code runs at least
     * once.
     */
    int x = 10;do
    {
        System.out.println("This will print even if x is not < 5");
        x++;
    }while(x<5);
    // Output: "This will print even if x is not < 5"

    /*
     * Feature,while,do-while
     * Check Time,Before the loop runs.,After the loop runs.
     * Min. Executions,0 times.,1 time.
     * Use Case,When you might not need to run it at all.,When you need at least one
     * execution (like a menu).
     */

}
