class SecondHalfReverse{
    public static void main(String[] args) {
    int[]arr={10,20,30,40,50,80};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println();
        int temp=0;
        for(int start=arr.length/2,end=arr.length-1;start<end;start++,end--){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        }

        System.out.println("After sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
