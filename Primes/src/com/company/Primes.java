package com.company;

public class Primes {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 101; i++) {
            if(isPrime(i)) {
                count++;
                if(i < 10) System.out.print(" ");
                System.out.print(i + " ");
                if(count % 5 == 0) System.out.println("");

            }
        }
    }

    public static boolean isPrime(int n) { //Если аргумент простое число, выдаёт true, если нет - false
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

