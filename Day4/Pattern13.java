import java.util.Scanner;
class Pattern13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1||j==1||i==a||j==a)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}