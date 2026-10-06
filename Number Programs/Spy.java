class Spy{
    public static void main(String[] args){
        int num=123;
        int temp=num;
        int sum=0;
        int count=1;
        while(temp!=0){                                        
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        System.out.println(sum);
        while(num!=0){
            int rem=num%10;
            count=count*rem;
            num=num/10;
        }
        System.out.println(count);
        if(count==sum){
            System.out.println("Its a Spy number");
        }
        else{
            System.out.println("Its not a Spy number");
        }
    }
}