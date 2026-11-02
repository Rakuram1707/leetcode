class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int s=0;
        int d= nums[nums.length/2];
        
        for(int i=0;i<n;i++)
        {
            
            s= s+ Math.abs( d-nums[i]);

        }

        
        return s;
}
}