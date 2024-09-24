package net.htlgkr.schmidmairL;

public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve eratosthenesPrimeSieve=new EratosthenesPrimeSieve(11);

        eratosthenesPrimeSieve.printPrimes();

        System.out.println(eratosthenesPrimeSieve.isPrime(113));
    }
}
