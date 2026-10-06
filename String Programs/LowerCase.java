public class LowerCase {
    public static void main(String[] args) {
        String name="SOUNDARYA";
        String res=" ";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
                res=res+ch;
            }
        }
        System.out.println(res);
    }
}
