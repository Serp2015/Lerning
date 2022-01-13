public class Lambda {
    public static void main(String[] args) {
        Calculate calc = (x, y) -> x * y;
        int number = calc.calculate(2, 5);
        System.out.println(number);
    }
}

interface Calculate {
    int calculate(int x, int y);
}