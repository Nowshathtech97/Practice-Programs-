public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr={10, 0, 10, 40, 20};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        int secondMin=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                if(secondMin==-1 || arr[i]<secondMin){
                    secondMin=arr[i];
                }
            }
        }
        if (secondMin == -1) {
            System.out.println("No second minimum found (all elements are same)");
        } else {
            System.out.println("Second Minimum: " + secondMin);
        }
    }
}


