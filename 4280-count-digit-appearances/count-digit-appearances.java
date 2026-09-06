class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int count=0;
        int x=0;
        for(int num : nums)
        {
            while(num !=0)
            {
                x=num%10;
                if(x==digit)
                {
                    count++;
                }
                num=num/10;
            }
        }
        return count;
        
    }
}