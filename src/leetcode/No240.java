package leetcode;
public class No240 {
/*
    public boolean searchMatrix(int[][] matrix, int target) {
        int height = matrix.length;
        if(height==0) return false;
        int width = matrix[0].length;
        if(width==0) return false;
        for(int i =0;i<height;i++){
            for(int j =0;j<width;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
*/
public boolean searchMatrix(int[][] matrix, int target) {
        int height = matrix.length;
        if(height==0) return false;
        int width = matrix[0].length;
        if(width==0) return false;
        int local_x = height-1;
        int local_y = 0;
        while(local_x>=0&&local_y<width){
            if(matrix[local_x][local_y]==target) return true;
            else if(matrix[local_x][local_y]>target){
                local_x--;
            }else{
                local_y++;
            }
        }
        
        return false;
    }


}