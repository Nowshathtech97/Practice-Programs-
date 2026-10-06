public class PrimeNumberArray {
    public static void main(String[] args) {
        int arr[]={634,282,45,767,89,80};
        for (int i=0;i<arr.length;i++) {
            int num=arr[i];
        int count=0;
        for(int j=1;j<=num;j++){
            if(num%j==0)
            count++;
        }
        if(count==2){
            System.out.println(num + " = Its prime number");
        }
        else{
            System.out.println(num + " = Its not a prime number");
        }
    }
}
}
