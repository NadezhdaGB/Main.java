package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> phoneBook = new HashMap<>();


    public void add(String phone, String surname) {
        phoneBook.put(phone, surname);
    }

    public String getPhoneBySurname(String surname) {
        if (phoneBook.containsValue(surname)) {
            String result = "Номера телефонов " + surname + ": ";
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).equals(surname)) result = result + key + ", ";
            }
            return result;
        } else return "Записей не найдено.";
    }

        /*private String surname;
    private String phone;

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public PhoneBook(String surname, String phone) {
        this.surname = surname;
        this.phone = phone;
    }*/


}
