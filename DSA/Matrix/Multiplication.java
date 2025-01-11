package DSA.Matrix;

public class Multiplication {
    public static void main(String[] args) {
        int m1[][] = {{1,2,3},{4,5,6} , {7,8,9}};
        int m2[][] = {{1,2,3},{4,5,6} , {7,8,9}};

        for(int i = 0 ; i<m1.length ; i++){    // still ..... wrong ans 
            for(int j = 0 ;j<m1[0].length ; j++){
                  for(int k = 0 ; k <m1.length;k++){
                      m1[i][j]+=m1[j][k]*m2[k][j];
                  }
            }
        }
       
        for(int i = 0 ; i<m1.length ; i++){
            for(int j = 0 ;j<m1[0].length ; j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
