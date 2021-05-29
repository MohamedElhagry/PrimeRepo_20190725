import java.util.Scanner;

public class PrimeProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = sc.nextInt();

        boolean isPrime = true;
        int maxCheck = (int) Math.sqrt(num);
        for (int i = 2; i < maxCheck; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(num + " is prime.");
        else System.out.println(num + " is not prime.");
    }
}
