public class Program24 {
    public static void main(String[] args) {
        char ch='A';
        int n=5;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for (int j=0;j<n;j++) {
                    System.out.print(ch+" ");
                    ch++;
                }
            } else {
                char[] temp=new char[n];
                for(int j=0;j<n;j++){
                    temp[j]=ch;
                    ch++;
                }
                for(int j=n-1;j>=0;j--) {
                    System.out.print(temp[j] + " ");
                }
            }
            System.out.println();
        }
    }
}

