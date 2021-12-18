public class IsANumberPrime {

    public static void main(String[] args) {
        IsANumberPrime isANumberPrime = new IsANumberPrime();
        System.out.println(isANumberPrime.hashCode());
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
