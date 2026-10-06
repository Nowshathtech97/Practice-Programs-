class GCD{
    public static void main(String[] args){
        int num1=20;
        int num2=30;
        for(int i=1;i<=num1;i++){
            if(num1%i==0)
            System.out.println(i);
        }
        for(int i=1;i<=num2;i++){
            if(num2%i==0)
            System.out.println(i);
        }
         int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: "+gcd);
       
}
}