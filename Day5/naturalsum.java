import java.util.Scanner;
public class naturalsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(num + " natural number's sum");
        System.out.println("the Natural number sum is :- "+sum);
    }
    

}