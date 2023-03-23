public class A1083366_0317_1 {
    public static void main(String[] args){
        System.out.print("請輸入整數n:");
        int n;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        n=sc.nextInt();

        System.out.print("請輸入整數m:");
        int m;
       m=sc.nextInt();

      
        int[][] table = new int[n][m];
  
            
            for (int i = 0; i<n; i++) {
                for (int j = 0; j<m; j++) {
                    table[i][j] = (i+1)*(j+1);    
                }
               
            }


            for (int[] row : table) {
                for (int value : row) {
                    System.out.printf("%3d ", value);
                }
                System.out.println();
            }    
        
        
    }
}
