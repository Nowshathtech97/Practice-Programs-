public class VowelConsonantCount {
    public static void main(String[] args) {
        String str="Good Morning";
        int vowel=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U'){
                vowel++;
            }
            else{
                consonent++;
            }
        }
        System.out.println("Total Vowel = "+vowel);
        System.out.println("Total Consonent = "+consonent);
    }
}
