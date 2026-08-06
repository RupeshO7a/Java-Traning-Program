class selectionsort{
    public static void main(String[] args) {
        int arr[]={105,120,10,200,20};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}