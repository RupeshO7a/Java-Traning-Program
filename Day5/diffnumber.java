import java.util.Scanner;
class Diffnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        System.out.print("enter the first number:- ");
        int first = sc.nextInt();
        System.out.print("enter the second number:- ");
        int second = sc.nextInt();
        int diff = first - second;
        int seq = 0;
        for(int i = 1; i <= n; i++){
            seq = first + i * diff;
            System.out.println(seq);
            
        }
        System.out.println("Difference of two numbers: "+ diff);

        // int sum = 0;
        // int temp = n;
        // while(n > 0){
        //     sum += n % 10;
        //     n /= 10;
        // }
        // System.out.println("Difference of digit's: "+ (temp - sum));
    }
}