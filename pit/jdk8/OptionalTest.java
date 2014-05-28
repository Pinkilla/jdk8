package pit.jdk8;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest { 
	public static void main ( String[] args ) throws Exception{
		//Optional<Integer> oi = Optional.of(7);
		Optional<Integer> oi = Optional.empty();

		System.out.printf("Or else: %d\n", oi.orElse(0));
        // old jdk7 way … must turn in lambda expression below
		System.out.printf("Or else throw: %d\n", 
				oi.orElseThrow(new Supplier<Exception>() {

            @Override
            public Exception get() {
                return new Exception("Hep !");
            }
        }));
		if (oi.isPresent()){
			System.out.printf("Get: %d\n", oi.get());
		}
	}

}

