public class SecondMaximum{
    public static void main(String[] args){
        int[] arr={10, 60, 20, 50, 40};
        int max = arr[0];
        for (int i=1;i<arr.length;i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondMax=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<max){
                if(secondMax==-1 || arr[i]>secondMax){
                    secondMax=arr[i];
                }
            }
        }
        if (secondMax == -1) {
            System.out.println("No second maximum found (all elements are same)");
        } else {
            System.out.println("Second Maximum: " + secondMax);
        }
    }
}

