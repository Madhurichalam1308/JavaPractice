package Test;

public class FindPrimeNumber {

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("2 is a Prime Number : "+isPrimeNumber(2));
        System.out.println("3 is a Prime Number : "+isPrimeNumber(3));
        System.out.println("10 is a Prime Number : "+isPrimeNumber(10));
        System.out.println("17 is a Prime Number : "+isPrimeNumber(17));
        System.out.println("0 is a Prime Number : "+isPrimeNumber(0));
    }
}
