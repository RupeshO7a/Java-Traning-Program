import java.util.Scanner;
class Perfectsquare{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :");
        int no = sc.nextInt();
        int sum=0;
        if(num<1)
        System.out.println("Perfect number");
        else{
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                sum=sum+i;
            }
        }
        if(sum==num)
        System.out.println("Perfect number");
        elseSystem.out.println("No Perfect number");
    }
}