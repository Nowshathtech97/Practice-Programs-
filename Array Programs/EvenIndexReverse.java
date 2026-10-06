class EvenIndexReverse{
    public static void main(String[] args) {
    int[]arr={10,20,49,30,37};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println();
        int temp=0;
        for(int start=0,end=arr.length-1;start<end;start++,end--){
           if(start%2==0 && end%2==0){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        }
    }

        System.out.println("After sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}