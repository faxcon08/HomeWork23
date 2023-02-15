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




    }// main
}// Main

