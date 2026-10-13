class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=-1*nums[i];
            }
        }
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));
        int d=(n/2);
        long s=0;
        for(int i=0;i<d;i++)
        {
            s= s - (long)(nums[i]*nums[i]);
        }
        for(int i=d;i<n;i++)
        {
            s=s+ (long)(nums[i]*nums[i]);
        }
        return s;
        
    }
}