public class SameOrNot {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        if(str1.length()!=str2.length()){
            System.out.println("Not same");
        }
        else if(str1.equalsIgnoreCase(str2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
