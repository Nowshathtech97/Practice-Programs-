public class CountWords {
    public static void main(String[] args) {
        String str="My name is Soundarya Lakshmi";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(i==0 || str.charAt(i-1)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
