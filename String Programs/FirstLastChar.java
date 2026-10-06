public class FirstLastChar {
    public static void main(String[] args) {
        String str="Hello";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==0){
                System.out.println(ch);
            }
            else if(i==(str.length()-1)){
                System.out.println(ch);
            }
    }
}
}
