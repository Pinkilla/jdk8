package pit.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person implements Comparable{

    protected String name;
    protected String description;

    public static final Person JL = new Person("Juste Leblanc");
    public static final Person MS = new Person("Marlène Sassœeur");
    public static final Person PB = new Person("Pierre Brochant");
    public static final Person FP = new Person("François Pignon");

    public static List<Person> getIdiots() {
        return new ArrayList(Arrays.asList(new Person[]{JL, MS, PB, FP}));
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public String toString() {
        return "Person{" + name + '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person)){
            throw new IllegalArgumentException("Not comparable");
        }
        return this.toString().compareTo(o.toString());
    }



}
