public class Palindrom {
    public static void main(String[] args) {
        String str="man";
        String res=" ";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            res=res+ch;
        }
        System.out.println(res);
        if(str.equalsIgnoreCase(res)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Plaindrom");
        }
}
}

