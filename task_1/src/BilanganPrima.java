/*
    Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1 dan bilangan itu sendiri.
    2 dan 3 adalah bilangan prima. 4 bukan bilangan prima karena 4 bisa dibagi 2.
    Kamu diminta untuk menentukan bahwa sebuah bilangan termasuk bilangan prima atau tidak.

    Buatkan solusi yang lebih optimal, dengan kompleksitas lebih cepat dari O(n) / O(n/2).
    
    Sample test cases

    input : 1000000007
    output : bilangan prima

    input : 1500450271
    output : bilangan prima
*/

public class BilanganPrima {
    public static void main(String[] args) {
        long input1 = 1000000007;
        long input2 = 1500450271;

        if (isPrime(input1)) {
            System.out.println(input1 + " adalah bilangan prima");
        } else {
            System.out.println(input1 + " bukan bilangan prima");
        }

        if (isPrime(input2)) {
            System.out.println(input2 + " adalah bilangan prima");
        } else {
            System.out.println(input2 + " bukan bilangan prima");
        }
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
