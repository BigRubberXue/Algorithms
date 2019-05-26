package leetcode;
class No4{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length+nums2.length;
        int i=0;
        int j=0;
        int local=0;
        int[] list = new int[x];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]){
                list[local++]=nums2[j];
                j++;
            }else{
                list[local++]=nums1[i];
                i++;
            }
        }
        if(i==nums1.length&&j<nums2.length){
            for(int k=j;k<nums2.length;k++){
                list[local++]=nums2[k];
            }
        }else if(j==nums2.length&&i<nums1.length){
            for(int k=i;k<nums1.length;k++){
                list[local++]=nums1[k];
            }
        }else{
            System.out.println("x");
        }
        double res =0;
        double judge = x%2;
        if(judge==0){
            res =(double)(list[x/2-1]+list[x/2])/2;
        }else{
            res = list[x/2];
        }
        return res;
    }
}