public class PerfectNumberArray {
    public static void main(String[] args) {
        int arr[]={6,28,45,67,89,80};
        for (int i=0;i<arr.length;i++) {
            int num=arr[i];
            int sum=0;
        for(int j=1;j<num;j++){
            if(num%j==0)
            sum = sum+j;
        }
        System.out.println("Number: " + num);
            if (sum == num) {
                System.out.println(num + " is a Perfect Number");
            } else {
                System.out.println(num + " is not a Perfect Number");
            }
       }
    }
}
