public class StrongNumber {
    public static void main(String[] args){
        int num=123;
        int temp=num;
        int sum=0;
        while(num > 0) {
            int rem =num%10;  
            int fact=1;
        for(int i=1;i<=rem;i++){
            fact=fact*i;
        }
            sum += fact; 
            num=num/10; 
        }
        if(sum==temp) {
            System.out.println(temp + " is a Strong Number");
        } else {
            System.out.println(temp + " is not a Strong Number");
        }
    }
}
