public class Main {
    public static void main(String[] args) {
        // tạo một thể hiện của static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.printVariables();

        // tạo một thể hiện của inner class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printVariables();
    }
}


