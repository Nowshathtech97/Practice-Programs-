public class RemoveFirstAndLastSpace {
    public static void main(String[] args){
        String s=" Hello World ";
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' '){
            start++;
        }
        while(end>=start && s.charAt(end)==' '){
            end--;
        }
        String res="";
        for(int i=start;i<=end;i++){
            res=res+s.charAt(i);
        }
        System.out.println(s);
        System.out.println(res);
    }
}
