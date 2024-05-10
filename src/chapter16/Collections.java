package chapter16;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        boolean b = true;
        Collection<Boolean> transactions = new ArrayList<>();
        char c = '0';
        Character b1 = c;
        Collection<String> word = new TreeSet<>();
        word.add("Happy");
        word.add("Happy");
        word.add("Happy");
        word.add("Happy");
        System.out.println(word);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> numbers2= new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(3);

        Set <List<Integer>> set = new HashSet<>();
        set.add(numbers);
        set.add(numbers2);
        System.out.println(set);
    }
}
