package Array.Medium;

public class setMatrixZeros {
    
   public void setMat(int mat[][]){
       int r=mat.length;
       int c= mat[0].length;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               //1st pass
               if(mat[i][j]==0){
                   for(int col=0;col<c;col++){
                       if(mat[i][col]!=0){
                           mat[i][col]=-1;
                       }
                   }
                   for(int row=0;row<r;row++){
                       if(mat[row][j]!=0){
                           mat[row][j]=-1;
                       }
                   }
               }
               
           }
       }
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(mat[i][j]==-1){
                   mat[i][j]=0;
               }
           }}
   }
   // Time Complexity: O(m*n*(m+n)) where m is number of rows and n is number of columns
   // Space Complexity: O(1) as we are using constant space
  
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i] || col[j]){
                matrix[i][j]=0;
                }
                }}
}
// Time Complexity: O(m*n) where m is number of rows and n is number of columns
// Space Complexity: O(m+n) for the additional row and column arrays


    public static void main(String[] args) {
        setMatrixZeros sol= new setMatrixZeros();
    int[][] mat = {
    {1, 2, 3},
    {4, 0, 6},
    {7, 8, 9}
};
 sol.setMat(mat);
for(int row[]: mat){
    for(int value:row){
        System.out.print(value+" ");
    }
    System.out.println();
}
        
    }
}