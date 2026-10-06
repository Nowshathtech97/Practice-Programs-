class PerfectNumber{
    public static void main(String[] args){
        int num=6;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum = sum+i;
        }
        System.out.println(sum);
        if(sum==num){ 
            System.out.println("Its a perfect number");
        }
        else{
            System.out.println("Its not a perfect number");
        }

    }
}