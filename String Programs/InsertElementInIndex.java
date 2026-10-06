public class InsertElementInIndex {
    public static void main(String[] args) {
        String str="Hello";
        String res=" ";
        char key='u';
        int index=2;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==index){
                res=res+key;
            }
            else{
                res=res+ch;
            }
        }
        System.out.println(res);
    }
}
