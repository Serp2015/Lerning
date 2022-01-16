import java.util.Optional;

public class Lambda {
    public static void main(String[] args) {
        Calculate calc = (x, y) -> x * y;
        int number = calc.calculate(2, 5);
        System.out.println(number);

        Optional<String> option = Optional.of("hello");
        System.out.println(option.get());
        option.ifPresent(x -> System.out.println(x.length()));
    }
}

interface Calculate {
    int calculate(int x, int y);
    default void test() {
        System.out.println("Test");
    }
    static void staticMethod() {
        System.out.println("staticMethod");
    }
}

class TestNew implements Calculate {

    @Override
    public int calculate(int x, int y) {
        return 0;
    }

    @Override
    public void test() {
        Calculate.super.test();
    }

    public void staticMethodImpl() {
        Calculate.staticMethod();
    }
}