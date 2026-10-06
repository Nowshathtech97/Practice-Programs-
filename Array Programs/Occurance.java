class Occurance{
    public static void main(String[] args) {
        int[]arr={10,20,10,40,50};
        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println();
        int key=10;
        for(int i=0;i<arr.length-1;i++){
        if(key==arr[i]){
            arr[i]=0;
        }
    }

        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}