package leetcode;
class No48 {
    public void rotate(int[][] matrix) {
        if(matrix.length<=1){
            return ;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        /*
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.println(matrix[i][j]);
            }
        }
        */
        for(int i=0;i<matrix.length;i++){
            int low=0;
            int high=matrix.length-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
           
        
    }
}