package leetcode;

class No547{
    public int findCircleNum(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int count=0;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(M[i][j]==1){
                    changeM(M,i,j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void changeM(int[][]M,int i,int j){
        if(i>=M.length||j>=M[0].length){
            return;
        }
        if(M[i][j]==0){
            return;
        }else{
            M[i][j]=0;
            for(int k=0;k<M.length;k++){
                changeM(M,k,j);
            }
            for(int k=0;k<M[0].length;k++){
                changeM(M,i,k);
            }
        }
    }
}