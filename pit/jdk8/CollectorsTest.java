package pit.jdk8;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        List<Person> wednesday = Person.getIdiots();
        Long count = wednesday
                .stream()
                .collect(Collectors.counting());


        String all = wednesday.stream()
                .map(new Function<Person,String>() {

            @Override
            public String apply(Person t) {
                return t.getName();
            }
        })
                .reduce("", new BinaryOperator<String>() {

            @Override
            public String apply(String t, String u) {
                return t + "—" + u;
            }
        });

        // en utilisant les lambdas "map/reduce"
        all = wednesday.stream()
                .map((Person p) -> p.getName())
                .reduce("", (String t, String u) -> t + " — " + u);

        // en utilisant les lambdas et l'helper Collectors 
        all = wednesday.stream()      
                .map((Person t) -> t.getName())
                //.collect(Collectors.joining());
                .collect(Collectors.joining(", "));




        System.out.println("Counting « friends »: " + count);
        System.out.println("Name list: " + all);
    }

}
