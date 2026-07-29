import java.util.Scanner;
class countofdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if(a>=0 && a<10)
        System.out.print("Single Digit");
        else if(a>=10 && a<100)
        System.out.print("Double Digits");
        else if(a>=100 && a<1000)
        System.out.print("Triple Digits");
        else if(a>=1000 && a<10000)
        System.out.print("Four Digits");
        else
        System.out.print("Out of range");
    }
}