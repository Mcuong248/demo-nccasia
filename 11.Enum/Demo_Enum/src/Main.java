public class Main {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s);


//  Duyệt các phần tử trong enum
        for (Season season : Season.values()){
            System.out.println(season);
        }
    }
}
