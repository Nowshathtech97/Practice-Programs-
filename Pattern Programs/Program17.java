public class Program17 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<5;i++){
            for(int j=1;j<=3;j++){
                System.out.print(j);
            }
            for(int j=n-1;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
