package net.htlgkr.schmidmairL;

public class EratosthenesPrimeSieve implements PrimeSieve {

    private final int up;
    private boolean[] gestrichen;


    public EratosthenesPrimeSieve(int up) {
        this.up = up;
        this.gestrichen = new boolean[up + 1];

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
