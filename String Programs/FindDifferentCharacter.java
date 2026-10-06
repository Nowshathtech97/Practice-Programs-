public class FindDifferentCharacter {
    public static void main(String[] args) {
        String str="abc@123# hi";
        int vowel=0;
        int consonent=0;
        int spl=0;
        int num=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U'){
                vowel++;
                }
                else{
                    consonent++;
                }
            }
            else if(ch>='0' && ch<='9'){
                   num++;
             }    
            else{
                 spl++;
             }
        }
        System.out.println("Total Vowel = "+vowel);
        System.out.println("Total Consonent = "+consonent);
        System.out.println("Total Numbers = "+num);
        System.out.println("Total SpecialCharcater = "+spl);
    }
}
