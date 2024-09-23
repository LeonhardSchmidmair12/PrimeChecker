package net.htlgkr.schmidmairL;

public class EratosthenesPrimeSieve implements PrimeSieve {

    private final int up;
    private boolean[] gestrichen;


    public EratosthenesPrimeSieve(int up) {
        this.up = up;
        this.gestrichen = new boolean[up + 1];
        sieve();
    }


    private void sieve() {
        for (int i = 2; i <= up; i++) {
            gestrichen[i] = false;
        }

        for (int i = 2; i <= Math.sqrt(up); i++) {
            if (!gestrichen[i]) {
                for (int j = i * i; j <= up; j += i) {
                    gestrichen[j] = true;
                }
            }
        }
    }


    @Override
    public boolean isPrime(int p) {
        if (p <= 1 || p > up) {
            return false;
        }
        return !gestrichen[p];
    }


    @Override
    public void printPrimes() {
        for (int i = 2; i <= up; i++) {
            if (!gestrichen[i]) {
                System.out.print(i + ", ");
            }
        }
    }

}
