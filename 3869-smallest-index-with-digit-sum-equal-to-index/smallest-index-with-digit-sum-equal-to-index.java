class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int rem=0;
        int sum=0;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            while(nums[i]!=0)
            {
                rem=nums[i]%10;
                sum=sum+rem;
                nums[i]=nums[i]/10;
            }
    
            if(sum==i)
            {
                min=Math.min(min,i);
                c++;
            }
            sum=0;
            
        }
        if(c==0)
        {
            return -1;
        }
        return min;
        
    }
}