package leetcode;
class No539{
    public int findMinDifference(List<String> timePoints) {
        int indx=0;
        int n = timePoints.size();
        int[] timeq = new int[n];
        for(String s : timePoints){
            String[] a = s.split(":");
            timeq[indx++]=Integer.parseInt(a[0])*60+Integer.parseInt(a[1]);
        }
        if(n>2){
            Arrays.sort(timeq);
            int min = timeq[1]-timeq[0];
            for(int i=2;i<n;i++){
                min = Math.min(min,timeq[i]-timeq[i-1]);
            }
            int max = timeq[n-1]-timeq[0];
            return Math.min(1440-max,min);
            
        }else{
            int res = Math.max(timeq[0]-timeq[1],timeq[1]-timeq[0]);
            return Math.min(res,1440-res);
        }
    }
}