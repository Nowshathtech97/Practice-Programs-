class UpperOrLower{
    public static void main(String[] args){
        char ch='s';
        if(ch>='A' && ch<='Z')
        System.out.println("Uppercase");
        else if(ch>='a' && ch<='z')
        System.out.println("Lowercase");
        else
        System.out.println("Invalid");
    }
}