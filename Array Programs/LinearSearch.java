class LinearSearch{
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int key=20;
        for(int i=0;i<arr.length-1;i++){
        if(key==arr[i]){
            System.out.println("Index of the Key is: "+i);
        }
    }

}
}