public class SpecifiedCharacter {
    public static void main(String[] args) {
        String str="Hello";
        String res=" ";
        char key='o';
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=key){
                res=res+ch;
            }
        }
        System.out.println(res);
    }
}
