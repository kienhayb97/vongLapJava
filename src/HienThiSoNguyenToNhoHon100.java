public class HienThiSoNguyenToNhoHon100 {

    public static void main(String[] args) {
        int n = 100;
        System.out.printf("\n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
