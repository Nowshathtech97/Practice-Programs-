class EvenMinAddsOddMax{
    public static void main(String[] args){
        int[] arr={10,55,97,2,35};
        int min=arr[1];
        for(int i=1;i<arr.length;i++){
            if(i%2==1){
        for(int j=1;j<arr.length;j++){
            if(min>arr[i]){
                min=arr[i];
                System.out.println("Min="+min);
            }
        }
        }
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
        for(int j=1;j<arr.length;j++){
            if(max<arr[i]){
                max=arr[i];
                 System.out.println("Max="+max);
            }
        }
        }
        }
       
        System.out.println("Sum=" +(min+max));
    }
}
