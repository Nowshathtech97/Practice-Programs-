public class Program11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                int value =n*n-(j*n+(i-1));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
