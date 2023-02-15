import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {

        Consumer<String> message = (s)->{
            String separator = " ============================ ";
            System.out.println(separator+s+separator);
        };
        Supplier<String> separator = ()->{
          String separator2 = "------------------------------------------------------------";
          System.out.println(separator2);
          return separator2;
        };

        message.accept("First Task 1.1;");

        int number1 = 5;
        Double number2 = -2.5;
        Predicate<Number> isPositive = new Predicate<>(){
            @Override
            public boolean test(Number number) {
                return  (number.intValue()>0);
            }
        };
        Predicate<Number> isPosivive2 = (x)->x.intValue()>0;

        System.out.println("'"+number1+"' is Positive: "+isPositive.test(number1));
        System.out.println("'"+number2+"' is Positive: "+isPositive.test(number2));

        message.accept("Second Task 1.2;");
        Consumer<String> consumer1 = new Consumer<String>(){
            @Override
            public void accept(String name) {
                System.out.println("Hellow, "+name);
            }
        };
        Consumer<String> consumer2 = (s)->System.out.println("Hellow, "+s);
        consumer1.accept("Anna");
        consumer2.accept("Jack");


    }// main
}// Main

