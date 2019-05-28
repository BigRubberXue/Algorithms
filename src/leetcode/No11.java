package leetcode;
class No11 {
    /*
    public int maxArea(int[] height) {
        int maxL=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int h = Math.min(height[i],height[j]);
                maxL=Math.max(maxL,(j-i)*h);
            }
        }
        return maxL;
    }
    */
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxL=(high-low)*Math.min(height[high],height[low]);
        while(low!=high){
            if(height[high]<height[low]){
                high--;
            }else{
                low++;
            }
            maxL=Math.max(maxL,(high-low)*Math.min(height[high],height[low]));
        }
        return maxL;
    }
}