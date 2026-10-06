class FirstHalfAvg{
     public static void main(String[] args) {
        int[]arr={10,20,30,40,50,11};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println();
        System.out.println("After sorting");
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length/2;i++){
            sum=sum+arr[i];
        }
        avg=sum/(arr.length/2);
        System.out.println(avg);
    }
}