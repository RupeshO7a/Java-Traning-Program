import java.util.Scanner;
class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}