class FirstHalfMin{
    public static void main(String[] args) {
        int[]arr={10,20,3,40,50};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println();
        System.out.println("After sorting");
        int min=arr[0];
        for(int i=1;i<arr.length/2;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
        
        }
}