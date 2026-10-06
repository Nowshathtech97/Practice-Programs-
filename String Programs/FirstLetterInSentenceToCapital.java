public class FirstLetterInSentenceToCapital {
    public static void main(String[] args) {
        String str="My name is soundarya lakshmi";
        String res=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==0 || str.charAt(i-1)==' '){
                if(ch>='a' && ch<='z'){
                    ch=(char)(ch-32);
                }
            }
            res=res+ch;
        }
        System.out.println(res);
    }
}
