package pit.jdk8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneMoreNIO {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home"), "tmp");
        try (Stream<Path> files = Files.list(path)){
            /*
            Long count = files
                    .collect(Collectors.counting());
            System.out.println("Nombre: " + count);
            */
            // Il faut commenter car on ne peut pas faire deux opérations sur
            // le même stream
            Stream<String> filesnames = files
                    .map((Path t) -> t.getFileName().toString())
                    .filter(f -> f.matches(".*png"));
            List<String> ls = filesnames.collect(Collectors.toList());
            System.out.println(
                String.join("\n", ls));

        } catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }

}
