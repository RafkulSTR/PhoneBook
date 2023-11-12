import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
        ArrayList<Integer> al = new ArrayList<>();
       if (phoneBook.get(name) != null) {
            al = phoneBook.get(name);
       }
        al.add(phoneNum);
        phoneBook.put(name, al);
    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        return phoneBook.getOrDefault(name, new ArrayList<>());
        //return phoneBook.get(name);
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
        return phoneBook;
    }
}


