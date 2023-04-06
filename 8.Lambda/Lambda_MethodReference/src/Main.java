public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        // Method reference using the object of the class
        MyInterface ref = example::myMethod;
        // Calling the method of functional interface
        ref.display();
    }
}
