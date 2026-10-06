class RightRotation{
    public static void main(String[] args) {
    int[]arr={10,20,49,30,37};
        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println();
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){

            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}