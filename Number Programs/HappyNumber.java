class HappyNumber{
    public static void main(String[] args){
        int num=19;
        int temp=num;
        while (temp !=1 && temp !=4){
            int sum=0;
            num=temp;
        while(num!=0){
            int rem=num%10;
            int pow=rem*rem;
            sum=sum +pow;
            num=num/10;
            
        }
        System.out.println(sum);
        temp=sum;
        }
        if(temp==1){
            System.out.println("Happy Number");
        } 
        else{
            System.out.println("Not a Happy Number");
        }
    }
}