public class PalindromArray {
    public static void main(String[] args) {
        int arr[]={634,282,45,767,89,80};
        for (int i=0;i<arr.length;i++) {
            int num=arr[i];
            int temp=num;
            int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
    if(temp==rev){
        System.out.println(temp + " =Its a Palindrom Number");
    }
    else{
        System.out.println(temp + " =Its not a Plaindrom Number");
    }
}
}
}
