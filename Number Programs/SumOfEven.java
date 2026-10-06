import java.util.Scanner;
class SumOfEven{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=S.nextInt();
        System.out.println("Enter the second number: ");
        int n2=S.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            if(i%2==0)
            sum=sum+i;
        }
        System.out.println(sum);

    }
}


//n1=1
//n2=9
//output=2+4+6+8=20
//int sum=0;
//for(i=n1;i<=n2;i++)
//if(i%2==0)
//sum=sum+1;

//sys.out(sum);