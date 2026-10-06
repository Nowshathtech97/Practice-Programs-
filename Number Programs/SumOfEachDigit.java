import java.util.Scanner;
class SumOfEachDigit{
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number= ");
        int num=s.nextInt();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println(sum);
     }    
}