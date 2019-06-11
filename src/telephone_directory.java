
import java.util.HashMap;
import java.util.HashSet;


public class telephone_directory {

    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.add("Ivanov", "111111111");
        directory.add("Ivanov", "22222222");
        directory.add("Ivanov", "33333333");
        directory.add("Sidorov", "444444444");
        directory.add("Sidorov", "555555555");
        directory.add("Petrov", "666666");
        directory.add("Petrov", "7777777");
        directory.add("Pupkin", "88888888");
        directory.add("Java", "999999999");
        System.out.println("Ivanov numbers "+ directory.get("Ivanov"));
        System.out.println("Sidorov numbers"+  directory.get("Sidorov"));
        System.out.println("Petrov numbers "+ directory.get("Petrov"));
        System.out.println("Pupkin numbers "+ directory.get("Pupkin"));
        System.out.println("Java numbers " + directory.get("Java"));


    }

     static class Directory {
         HashMap<String, HashSet<String>> directory_hm = new HashMap<>();
         HashSet<String> phone_number_list = new HashSet<>();

         void add(String surname, String phone_number) {
            if (directory_hm.containsKey(surname)) {
                phone_number_list = directory_hm.get(surname);
                phone_number_list.add(phone_number);
                directory_hm.put(surname, phone_number_list);
            } else {
                phone_number_list = new HashSet<>();
                phone_number_list.add(phone_number);
                directory_hm.put(surname, phone_number_list);
            }
        }

         HashSet<String> get(String surname) {
            return directory_hm.get(surname);
        }
    }
}




