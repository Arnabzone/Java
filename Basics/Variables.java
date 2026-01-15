package Basics;

/*
variable is a container that holds data while a program is running.
 Because Java is a statically-typed language, every variable must have a declared "type" so the computer knows exactly how much memory to set aside and what kind of data to expect.
 dataType variableName = value;

  where you declare a variable determines its "scope" (where it can be used):
  Variable
 Type Location Lifetime
  Local: Inside a method or block.Exists only while the method is running.
  Instance: Inside a class, but outside methods.Exists as long as the object exists.
  Static: Inside a class with the static keyword.Exists as long as the program is running.
 
*/
public class Variables {
    // Static Variable (Shared by all instances)
    static String schoolName = "Tech Academy";

    // Instance Variable (Unique to each object created)
    int studentId = 101;

    public void displayInfo() {
        // Local Variable (Only exists inside this method)
        double gpa = 3.8;

        System.out.println("ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.displayInfo();
    }
}