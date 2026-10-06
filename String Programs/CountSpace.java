public class CountSpace {
    public static void main(String[] args) {
        String str="Hello Guys Good Morning";
        int space=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(ch==' '){
            space++;
        }
    }
    System.out.println("Total Space= "+ space);
   }
}
