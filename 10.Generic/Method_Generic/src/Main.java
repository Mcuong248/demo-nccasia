public class Main {
        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 50, 100, 200, 500, 1000};
            Character[] charArray = {'J', 'A', 'V', 'A'};

            System.out.print("In mảng số nguyên: ");
            printArray(intArray);

            System.out.print("In mảng ký tự: ");
            printArray(charArray);
        }
        public static <E> void printArray(E[] elements) {
            for (E element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
}

