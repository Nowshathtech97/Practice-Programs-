class AutoMorphic{
    public static void main(String[] args){
        int num=255;
        int square=num*num;
        int temp=num;
        int divisor=1;
        while(num!=0){
            divisor=divisor*10;
            num=num/10;

            }
        if(square%divisor==temp){
            System.out.println("Its a Automorphic Number");
        }
        else{
            System.out.println("Its not a Automorphic Number");
        }
        
    }
}