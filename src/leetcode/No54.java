package leetcode;
class No54 {
    int m;
    int n;
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        if(matrix.length<=0||matrix[0].length<=0){
            return list;
        }
        m = matrix.length;
        n = matrix[0].length;
        for(int i=0; n>2*i && m>2*i ;i++){
            list=printspiral(list,i,matrix);
        }
        return list;
    }
    
    public List<Integer> printspiral(List<Integer> list,int start,int[][] matrix){
        
        int hang = n-start-1;
        int lie = m-start-1;
        
        for(int i=start;i<=hang;i++){
            list.add(matrix[start][i]);
        }
        if(start<lie){
            for(int i=start+1;i<=lie;i++){
                list.add(matrix[i][hang]);
            }
        }
        if(start<hang && start<lie){
            for(int i=hang-1;i>=start;i--){
                list.add(matrix[lie][i]);
            }
        }
        if(start<hang&&start<lie-1){
            for(int i=lie-1;i>start;i--){
                list.add(matrix[i][start]);
            }
        }
        return list;
    }
}