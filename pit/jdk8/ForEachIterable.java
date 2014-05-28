package pit.jdk8;

import java.util.List;
import java.util.function.Consumer;

public class ForEachIterable {
    public static void main(String[] args) {
        List<Person> wednesday = Person.getIdiots();

        // old old way, ce bon vieux foreach
        for (Person person : wednesday) {
            System.out.println(person.getName());
        }

        // old way
        wednesday.forEach(new Consumer<Person>() {

            @Override
            public void accept(Person t) {
                System.out.println(t.getName());
            }
        });

        wednesday.forEach((Person t) -> {
            System.out.println(t.getName());
        });

        wednesday.forEach(t -> System.out.println(t));

        String[] ss = new String[] {"Jean", "François", "Xavier"};
        // pas pour les arrays
    }

}
