public class Main {
    public static void main(String[] args) {
        // Sử dụng Interger
        MyGeneric<Integer> myGeneric = new MyGeneric<>();
        myGeneric.add(8);
        System.out.println(myGeneric.getObj());

        //Sử dụng String
        MyGeneric<String> myGeneric1 = new MyGeneric<>();
        myGeneric1.add("MCuong");
        System.out.println(myGeneric1.getObj());
    }
}
