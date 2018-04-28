package decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("a","a", 1));
        personList.add(new Person("b","b", 2));
        personList.add(new Person("a","c", 3));
        personList.add(new Person("d","d", 45));
        personList.add(new Person("e","e", 32));
        personList.add(new Person("f","f", 12));
        personList.add(new Person("g","g", 11));
        personList.add(new Person("h","h", 35));
        personList.add(new Person("i","i", 32));
        personList.add(new Person("j","j", 1));

        int count = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName() == "a") {
                count++;
            }
        }
        System.out.println(count);

        List<Person> newList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getAge() > 30) {
                newList.add(personList.get(i));
            }
        }
        System.out.println(newList);

        PersonList myPersonList = new PersonList(personList);
        System.out.println(myPersonList.getCount("a"));
        System.out.println(myPersonList.getList(30));
    }
}
