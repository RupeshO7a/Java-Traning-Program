import java.util.Scanner;
class Increment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        for(int i=1, j=num; i<=num && j>=num; i++,
             j--){
            System.out.println(i+"-"+j);
        }
    }
}