public class IndexOfSubString {
    public static void main(String[] args) {
        String s1="Hello World";
        String s2="World";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            for(int j=0;j<s2.length();j++){
            char ch1=s2.charAt(j);
            if(i==0 || s1.charAt(i-1)==' '){
                if(ch==ch1){
                    System.out.println(i);
                }
            }
        }
    }
}
}
