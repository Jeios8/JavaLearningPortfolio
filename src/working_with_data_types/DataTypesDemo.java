package working_with_data_types;

public class DataTypesDemo {
    // Instance variable
    int instanceVariable = 100;

    public static void main(String[] args) {
        // Primitive data types
        int age = 33; // Integer
        double height = 5.11; // Floating-point
        char initial = 'R'; // Character
        boolean isStudent = true; // Boolean

        // Printing primitives
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Is Student: " + isStudent);

        // Wrapper classes
        Integer boxedAge = age; // Autoboxing
        Double boxedHeight = height;
        Boolean boxedStudent = isStudent;

        System.out.println("Boxed Age: " + boxedAge);
        System.out.println("Boxed Height: " + boxedHeight);
        System.out.println("Boxed Student: " + boxedStudent);

        // Object lifecycle: Create and dereference an object
        String greeting = new String("Hello, Java!"); // Object creation
        System.out.println(greeting);
        greeting = null; // Dereferencing
        System.gc(); // Suggest garbage collection (not guaranteed)
    }

    // Method to demonstrate instance variable
    public void showInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVariable);
    }
}
