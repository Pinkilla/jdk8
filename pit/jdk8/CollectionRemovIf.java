package pit.jdk8;

import java.util.Collection;

public class CollectionRemovIf {
    public static void main(String[] args) {
        Collection<Person> wednesday = Person.getIdiots();
        wednesday.add(new GenderPerson("Éphémère", Gender.OTHER));
        wednesday.forEach((t) -> System.out.println(t));
        /* old way
        wednesday.removeIf(new Predicate<Person>() {

            @Override
            public boolean test(Person t) {
                return t instanceof GenderPerson;
            }
        });
        */

        wednesday.removeIf((Person t) -> t instanceof GenderPerson);
        wednesday.removeIf(t -> t.getName().contains("Marlène"));
        wednesday.forEach(t -> System.out.println(t));
    }

}
