public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("qweRt1yu"));
    }

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])|([0-9])", " $1$2");
    }
}
