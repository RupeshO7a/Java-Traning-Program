import java.util.Scanner;
class singledimension{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int size = s.nextInt();
        int arr[] = new int[size];
        int num = 1;
        for(int i = 0; i < size; i++){
            arr[i] = num++;
            System.out.print(arr[i] + " ");
        }
    }
}