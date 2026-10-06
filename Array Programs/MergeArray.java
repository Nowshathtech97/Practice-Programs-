class MergeArray{
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int[] arr1={60,70,80,90,100};
        int[]temp=new int[arr.length+arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];

        }
        for(int j=0;j<arr1.length;j++){
            temp[arr.length+j]=arr1[j];
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+",");
        }
        System.out.println();
    }
}