package pit.jdk8;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesTest {
    public static void main(String[] args) {
        // old way
        Predicate<Object> p = new Predicate() {

            @Override
            public boolean test(Object t) {
                return t.toString().length() > 17;
            }
        };

        Function<String, Person> f = new Function<String, Person>() {

            @Override
            public Person apply(String t) {
                return new Person(t);
            }
        };
        BiConsumer<Person, String> bi = new BiConsumer<Person, String>() {

            @Override
            public void accept(Person t, String u) {
                t.setDescription(u);
            }
        };

        //jdk8
        Predicate<Object> p8 = t -> t.toString().length() > 17;
        Function<String, Person> f8 = s -> new Person(s);
        BiConsumer<Person, String> bi8 = (t, u) -> t.setDescription(u);
        
    }
}
