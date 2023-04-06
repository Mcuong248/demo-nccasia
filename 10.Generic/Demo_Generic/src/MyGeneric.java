public class MyGeneric<T>  {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

     T getObj() {
        return obj;
    }
}
