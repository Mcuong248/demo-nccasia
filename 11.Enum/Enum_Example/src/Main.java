import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clothes> clothesList = new ArrayList<>();
        clothesList.add(Clothes.DRESS);
        clothesList.add(Clothes.SHIRT);
        clothesList.add(Clothes.SHOES);
        clothesList.add(Clothes.TROUSER);
        System.out.println("-------------");
        for (Clothes c : clothesList){
            System.out.println(c.getName() + " - " + c.getPrice() + " - " + c.getSize());
        }
    }
}
