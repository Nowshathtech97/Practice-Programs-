public class Program10 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                int value = i + j * n;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
