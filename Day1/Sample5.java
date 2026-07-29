import java.util.Scanner;
class Sample5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        char c = sc.next().charAt(0);
        int a = c;
        System.out.println("The ASCII value of " + c + " is " + a);

    }

}