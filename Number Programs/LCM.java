class LCM{
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
        int max = (num1 > num2) ? num1 : num2;

        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("LCM= "+i);
                break;
            }
        }
    }
}