package Array.Medium;

public class rotateMatrix {
    
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse each row
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
        while(l<r){
             int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
        }}
    }

    // Time Complexity: O(n^2) where n is the number of rows or columns in the matrix
    // Space Complexity: O(1) as the rotation is done in-place without using any additional space  



     public void rotate(int[][] matrix) {
        int n=matrix.length;
        int ans[][]= new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        return ans;
    }
    // Time Complexity: O(n^2) where n is the number of rows or columns in the matrix
    // Space Complexity: O(n^2) for the additional matrix used to store the rotated version
}