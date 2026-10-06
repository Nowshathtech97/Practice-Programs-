public class UpperCase {
    public static void main(String[] args) {
        String str="soundarya";
        String res=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
                res=res+ch;
            }
        }
        System.out.println(res);

    }
}
