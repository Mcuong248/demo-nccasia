public class OuterClass {
    private static int staticVariable = 10;
    private int nonStaticVariable = 20;

    // static nested class
    public static class StaticNestedClass {
        public void printVariables() {
            System.out.println("Static variable: " + staticVariable);
        }
    }

    // inner class
    public class InnerClass {
        public void printVariables() {
            System.out.println("Static variable: " + staticVariable);
            System.out.println("Non-static variable: " + nonStaticVariable);
        }
    }
}

