package pit.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringTest {

    public static void main(String[] args) {
        // old and naive ?
        String hello = "Hello";
        String world = "world";

        String s = hello + " " + world;
        System.out.println(s);

        StringBuilder sb = new StringBuilder(hello);
        sb.append(" " + world);
        System.out.println(sb);

        // jdk8 way
        //StringJoiner sj = new StringJoiner(" ", "«", "»");
        StringJoiner sj = new StringJoiner(" ");
        sj.add(hello).add(world);
        System.out.println(sj);

        Scanner clavier = new Scanner(System.in);
        clavier.nextLine();

        StringJoiner sj123 = new StringJoiner(" - ", "[ ", " ]");
        sj123.add("one").add("two").add("three");
        System.out.println(sj123);

        System.out.println(
                String.join(", ", "one", "two", "three"));

        // Méthode join à partir d'un itérable
        List<String> strings = Arrays.asList(
                new String[]{"one", "two", "three"});
        System.out.println(
                "["
                + String.join(" - ", strings)
                + "]");
    }
}
