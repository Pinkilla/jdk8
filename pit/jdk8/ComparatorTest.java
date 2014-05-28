package pit.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Person> wednesday = Person.getIdiots();
        System.out.println("Before ----------------------------");
        wednesday.forEach(t -> System.out.println(t.getName()));
        
        wednesday.sort(Comparator.naturalOrder());
        System.out.println("Natural order----------------------");
        wednesday.forEach(t -> System.out.println(t.getName()));
        
        wednesday.sort(Comparator.reverseOrder());
        System.out.println("Reverse order----------------------");
        wednesday.forEach(t -> System.out.println(t.getName()));

        wednesday.sort(Comparator.comparing(Person::getName));
        System.out.println("Create an order--------------------");
        wednesday.forEach(t -> System.out.println(t.getName()));

        wednesday.sort((Person o1, Person o2)
                -> o1.name.charAt(1) - o2.name.charAt(1));
        wednesday.sort((o1, o2) ->
                o1.name.charAt(1) - o2.name.charAt(1));


        
    }

}
