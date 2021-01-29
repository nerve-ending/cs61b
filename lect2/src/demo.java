public class demo {
    /*
    * Print all primes up to ARGS[0] (interpreted as an
    *  integer), 10 to a line
    * */
    public static void main(String[] args) {
        printPrimes(Integer.parseInt(args[0]));
    }

    /*
    * Print all primes up to and including LIMIT,
    * 10 to a line
    * */
    private static void printPrimes(int limit) {
        /*{ For every integer, x, between 2 and LIMIT, print
            isPrime(x), 10 to a line.} */
    }

    /* True iff X is prime */
    private static boolean isPrime(int x) {
        if (x <= 1)
            return false;
        else
            return !isDivisible(x, 2); //"!" means "not"
    }
    /* True iff X is divisible by any positive number >=K and < X，
    *  given K > 1
    * */
    private static boolean isDivisible(int x, int k) {
        if (k >= x)
            return false;
        else if (x % k == 0)
            return true;
        else //if (k < x && x % k != 0)
        return isDivisible(x, k+1);
    }

}
