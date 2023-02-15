import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {

        Consumer<String> message = (s) -> {
            String separator = " ============================ ";
            System.out.println(separator + s + separator);
        };
        Supplier<String> separator = () -> {
            String separator2 = "------------------------------------------------------------";
            System.out.println(separator2);
            return separator2;
        };

        message.accept("First Task 1.1;");

        int number1 = 5;
        Double number2 = -2.5;
        Predicate<Number> isPositive = new Predicate<>() {
            @Override
            public boolean test(Number number) {
                return (number.intValue() > 0);
            }
        };
        Predicate<Number> isPosivive2 = (x) -> x.intValue() > 0;

        System.out.println("'" + number1 + "' is Positive: " + isPositive.test(number1));
        System.out.println("'" + number2 + "' is Positive: " + isPositive.test(number2));

        message.accept("Second Task 1.2;");
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hellow, " + name);
            }
        };
        Consumer<String> consumer2 = (s) -> System.out.println("Hellow, " + s);
        consumer1.accept("Anna");
        consumer2.accept("Jack");

        message.accept("Third Task 1.3;");
        Function<Double, Long> rounding1 = new Function<>() {
            @Override
            public Long apply(Double d) {
                return d.longValue();
            }
        };
        Function<Double, Long> rounding2 = (d) -> {
            return d.longValue();
        };
        Double double1 = 11.222;
        Double double2 = -244.4455;
        System.out.println("Long value of [" + double1 + "] is [" + rounding1.apply(double1) + "]");
        System.out.println("Long value of [" + double2 + "] is [" + rounding2.apply(double2) + "]");

        message.accept("Fourth Task 1.4;");
        Supplier<Integer> randomNumber1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(101);
            }
        };
        Supplier<Integer> randomNumber2 = () -> {
            return (new Random()).nextInt(101);
        };
        System.out.println("Random Number [0-100] is " + randomNumber1.get());
        System.out.println("Random Number [0-100] is " + randomNumber2.get());

        //message.accept("Fifth Task 1.5;");

    }// main
}// Main

