class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int d=0;
        
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            int min = Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++)
            {
                
                min=Math.min(min,nums[j]);
            }
            d=max-min;
            if(d<=k)
            {
                return i;
            }
            
        }
        return -1;
       
        
    }
}