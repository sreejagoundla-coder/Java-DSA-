import java.util.*;
public class SearchMatrix2 {     //Lc 240. Search a 2D Matrix 2 
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int row=0;
        int col=cols-1;
        if(rows==0 || cols==0){
            return false;
        }
        while(row<rows && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
            }
            return false;
        }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;
        System.out.println(searchMatrix(matrix,target));
    }
}