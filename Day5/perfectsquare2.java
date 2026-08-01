import java.util.Scanner;
class Perfectsqure2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        for(int i = n; i <= n; i++){
            System.out.println(i * i);
            if(i < 0){
                System.out.println("-" + i * i + " ");
            }else{
                System.out.print(i * i + " ");
            }
        }
    }
}