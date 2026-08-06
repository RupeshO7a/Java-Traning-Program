class bubblesort{
    public static void main(String[] args) {
        int arr[] = {5,2,6,7,3};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}