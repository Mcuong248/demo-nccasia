import java.util.*;

public class PhoneBook extends Phone{
    private List<String> phoneList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int findIndexByName(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            String[] elements = phoneList.get(i).split(" : ");
            String phoneName = elements[0];
            if (phoneName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    void insertPhone(String name, String phone) {
        int index = findIndexByName(name);
        if (index == -1){
            phoneList.add(name + " : " + phone);
        }else {
            String[] elements = phoneList.get(index).split(" : ");
            String oldPhone = elements[1];
            if (!oldPhone.contains(phone)){
                phoneList.set(index, name + " : " + oldPhone + " : " + phone);
            }
        }
    }

    @Override
    void removePhone(String name) {
        int index = findIndexByName(name);
        if (index != -1){
            phoneList.remove(index);
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        int index = findIndexByName(name);
        if (index != -1){
            String[] element = phoneList.get(index).split(" : ");
            String newName = element[0];
            phoneList.set(index, newName + " : " + newphone);
        }
    }

    @Override
    void searchPhone(String name) {
        int index = findIndexByName(name);
        if (index != -1){
            String[] elements = phoneList.get(index).split(" : ");
            String phone = elements[1];
            System.out.println("Phone number of " + name + " is " + phone);
        }else {
            System.out.println(name + " does not exist in the phone book");
        }
    }

    @Override
    void sortPhone() {
        Collections.sort(phoneList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String[] elements1 = o1.split(" : ");
                String name1 = elements1[0];
                String[] elements2 = o2.split(" : ");
                String name2 = elements2[0];
                return name1.compareToIgnoreCase(name2);
            }
        });
        for (String phone : phoneList) {
            System.out.println(phone);
        }
    }
}
