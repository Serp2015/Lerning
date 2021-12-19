public class SumOfDigits {
    public static int digital_root(int n) {
        String[] arr = String.valueOf(n).split("");
        n = 0;
        for (String s : arr) {
            n = n + Integer.parseInt(s);
        }
        if (n > 9) n = digital_root(n);
        return n;
    }
}
