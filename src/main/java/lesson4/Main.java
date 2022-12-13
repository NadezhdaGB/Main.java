package lesson4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("собака");
        words.add("снег");
        words.add("олень");
        words.add("собака");
        words.add("олень");
        words.add("дрова");
        words.add("олень");
        words.add("снег");
        words.add("ковер");
        words.add("олень");
        words.add("собака");
        words.add("чайник");

        ArrayList<String> uniqWords = new ArrayList<>();

        for (String word : words) {
            Integer iteration = Collections.frequency(words, word);
            if (!uniqWords.contains(word + " " + iteration)) {
                uniqWords.add(word + " " + iteration);
            }
        }
        System.out.println("Уникальные слова в списке повторяются " + uniqWords);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("89112345678", "Иванов");
        phoneBook.add("89119876543", "Иванов");
        phoneBook.add("89223456789", "Петров");
        phoneBook.add("89332254687", "Смирнов");

        System.out.println(phoneBook.getPhoneBySurname("Иванов"));
        System.out.println(phoneBook.getPhoneBySurname("Смирнов"));
        System.out.println(phoneBook.getPhoneBySurname("Иванова"));


    }
}
