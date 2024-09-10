import java.util.ArrayList;

public class PrimePalindrome {
    // Method to check if the number is a palindrome
    public boolean isPalindrome(int n) {
        int org = n;
        int pal = 0;
        while (n != 0) {
            int rem = n % 10;
            pal = pal * 10 + rem;
            n = n / 10;
        }
        return pal == org;
    }

    // Sieve of Eratosthenes to find all primes up to a given range
    public ArrayList<Integer> sieveOfEratosthenes(int limit) {
        boolean[] not_primes = new boolean[limit + 1]; // To mark non-primes
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (!not_primes[i]) {
                primes.add(i); // i is prime
                for (int j = i * 2; j <= limit; j += i) {
                    not_primes[j] = true; // Mark multiples of i as non-prime
                }
            }
        }
        return primes;
    }

    // Method to find the next prime palindrome greater than or equal to n
    public int primePalindrome(int n) {
        int limit = 200000000; // Limit set to 2 * 10^8

        // Generate all prime numbers up to the limit
        ArrayList<Integer> primes = sieveOfEratosthenes(limit);

        // Iterate through the primes and check for palindromes
        for (int prime : primes) {
            if (prime >= n && isPalindrome(prime)) {
                return prime; // Return the first prime palindrome greater than or equal to n
            }
        }
        return -1; // No prime palindrome found within the range
    }

    public static void main(String[] args) {
        PrimePalindrome obj = new PrimePalindrome();
        int result = obj.primePalindrome(100030002);
        System.out.println("Next prime palindrome: " + result);
    }
}
