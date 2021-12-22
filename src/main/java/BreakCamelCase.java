public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("qweRtyu"));
    }

    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if (!String.valueOf(input.charAt(i)).matches("[A-Z]")) {
                sb.append(input.charAt(i));
            } else sb.append(" " + input.charAt(i));
        }
        return sb.toString();
    }
}
