public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        addOne(obj);
        //addOne1(obj);
        System.out.println(obj.value); // output: 6
    }
    public static void addOne(MyClass x) {
        x.value = x.value + 1;
    }

    public static void addOne1(MyClass x) {
        x = new MyClass(6);
    }

    public static void addOne1(MyClass x1, MyClass x2) {
        x1 = x2;
    }
}

