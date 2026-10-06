public class RemoveVowel {
    public static void main(String[] args) {
        String str="Soundarya";
        String res=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
            if(ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch !='u' && ch !='A' && ch !='E' && ch!='I' && ch!='O' && ch!='U'){
                   res += ch;
            }
        }
        System.out.println(res);
    }
}
