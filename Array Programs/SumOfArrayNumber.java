class SumOfArrayNumber{
    public static void main(String[] args){
    int[] arr={12,54,66,33,10};
    System.out.println("Before sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("After sorting");
    for(int i=0;i<arr.length;i++){
        int sum=0;
        while(arr[i]!=0){
            int rem=arr[i]%10;
            sum=sum+rem;
            arr[i]=arr[i]/10;
        }
        System.out.print(sum+",");
       }
    }
}
    