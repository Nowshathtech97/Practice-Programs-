class Neon{
    public static void main(String[] args){
        int num=9;
        int square=num*num;
        int sum=0;
      
        while(square!=0){
            int rem = square % 10;
            int pow = rem; 
            sum = sum + pow;
            square = square / 10;
        }
        
        if(sum==num){
            System.out.println("Its Neon Number");
        }
        else{
            System.out.println("Its not Neon Number");
        }
    }
}