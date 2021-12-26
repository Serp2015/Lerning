public class GiveMeADiamond {
    public static void main(String[] args) {
        System.out.println(print(3));
    }
    public static String print(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == ((n + 1) / 2)) || (j == ((n + 1) / 2))) builder.append("*");
                else builder.append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
