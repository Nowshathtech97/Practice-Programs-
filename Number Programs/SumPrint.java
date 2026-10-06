import java.util.Scanner;
class SumPrint{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=S.nextInt();
        System.out.println("Enter the econd number: ");
        int n2=S.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            sum=sum+i;
        }
        System.out.println("Sum of the numbers is= "+sum);      
    }
}

// Print sum of numbers between range 
// first number=1 second number = 4
// output = 10(1+2+3+4)



