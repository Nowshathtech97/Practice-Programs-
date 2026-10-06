public class OnlyFirstOccurance {
    public static void main(String[] args){
        String str="Hello";
        String res=" ";
        char key='l';
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==key && count==0){
                count++;
                continue;
            }
            res=res+ch;
        }
        System.out.println(res);
    }
}
