package decorator;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonList {
    private List<Person> personList;

    public PersonList(List<Person> personList) {
        this.personList = personList;
    }

    public long getCount(String name) {
        return personList
                .stream()
                // kilka różnych metod na pozbycie sie nulli
//                .filter(p -> p != null)
//                .filter(person -> Objects.notNull(person))
                .filter(Objects::nonNull)
                .filter(p -> p.getName() == name)
                .count();
    }

    public List<Person> getList(int age) {
        return personList
                .stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "personList=" + personList +
                '}';
    }
}
