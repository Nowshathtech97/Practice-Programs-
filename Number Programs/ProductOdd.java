import java.util.Scanner;
class ProductOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N1: ");
        int n1=sc.nextInt();
        System.out.println("Enter N2: ");
        int n2=sc.nextInt();
        int product=1;
        for(int i=n1;i<=n2;i++){
        if(i%2==1)
        product=product*i;
        }
        System.out.println(product);


    }
}


//a=1;
//b=7;
//output=1*3*5=15
//int prod=1;
//for(i=a;i<b;i++)       i=1;1<7;1++;
                         //1%2==1;
                         //prod=1*1=1;    prod=1;   //prod=1*3=3;   prod=3;    prod=3*5=15;
//if(i%2==1)
//prod=prod*i