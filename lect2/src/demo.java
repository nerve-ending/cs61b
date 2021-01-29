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
            return !isDivisible(x, 2);
    }

    private static boolean isDivisible(int x, int k) {
        if (k >= x)
            return false;
        else if (x % k == 0)
            return true;
        else
            return isDivisible(x, k + 1);

        /*while (k < x) {
            if (x % k == 0)
                return true;
                k = k + 1;
        }
        return false;*/

        /*int k1 = k;
        while (k1 < x) {
            if (x % k1 == 0)
                return true;
            k1 += 1;
        }
        return false;*/

        /*for (int k1 = k; k1 < x; k++) {
            if (x % k1 == 0)
                return true;
        }
        return false;*/
    }

}
