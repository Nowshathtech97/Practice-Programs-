class Palindrom{
    public static void main(String[] args){
        int num=232;
        int temp=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
    }
    if(temp==rev){
        System.out.println("Its a Palindrom Number");
    }
    else{
        System.out.println("Its not a Plaindrom Number");
    }
  }
}