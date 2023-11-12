import java.util.*;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap();


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
        List<Map.Entry<String, ArrayList<Integer>>> list = new LinkedList<>(phoneBook.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
            public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                return Integer.compare(o1.getValue().size(), o2.getValue().size());
            }
        });

        LinkedHashMap<String, ArrayList<Integer>> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;

        //return phoneBook;
    }


}


