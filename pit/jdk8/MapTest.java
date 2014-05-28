package pit.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, Person.FP);
        map.put(2, Person.JL);
        map.putIfAbsent(3, Person.MS);
        map.put(5, Person.PB);
        // Quelle différence entre put et replace ?
        map.put(5, new Person("Éphémère"));
        map.replace(5, Person.PB);


        /*
         * forEach, parcours du map
         */

        /* without lambda */
        map.forEach(new BiConsumer<Integer, Person>() {

            @Override
            public void accept(Integer t, Person u) {
                System.out.println(u + " (" + t + ")");
            }
        });
        // ou
        map.forEach((Integer t, Person u) -> {
            System.out.println(u + " (" + t + ")");
        });
        System.out.println(map.toString());

        /*
         * Remplacement de toutes les valeurs (mais de même type ou bien enfant)
         */

        /* without lambda */
        map.replaceAll(new BiFunction<Integer, Person, GenderPerson>() {

            @Override
            public GenderPerson apply(Integer k, Person v) {
                return new GenderPerson("NEW-" + v.getName(), Gender.UNKNOW);
            }
        });
        // ou
        map.replaceAll((k, v) -> new GenderPerson(v.getName(), Gender.UNKNOW));
        System.out.println(map.toString());

        map.compute(3, (Integer k, Person v) -> {
            ((GenderPerson) v).setGender(Gender.FEMALE);
            return (GenderPerson) v;
        });
        System.out.println(map.toString());
    }
}
