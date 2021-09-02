package Time_and_Space;

import java.util.Arrays;

public class SOE {
    public static void main(String[] args) {
        SOE(25);
    }

    //SOE -> sieve of eratosthenes
    //gives us the optimized solution for finding primes upto n
    //T.C -> nlog(logn)
    public static void SOE(int n) {
        boolean[] primes = new boolean[n+1];

        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for(int table = 2; table*table <= n; table++){
            if(!primes[table]) {
                continue;
            }
            for(int mult = 2; table*mult <= n; mult++) {
                primes[table*mult] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
    }

}
