package pf;

public class primeCheck {
    static void PrimeCheck(int num){
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " Prime");
        } else {
            System.out.println(num + " Not Prime");
        }
    }
}
