class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max=0;
        int n=s.length();
        int i=0;
        for(int j=0;j<n;j++)
        {
            while(set.contains(s.charAt(j)))
            {
                
                set.remove(s.charAt(i));
                
                i++;

            }
            set.add(s.charAt(j));
            max=Math.max(max,j-i+1);
           
            
        }
        return max;
        

        
        
    }
}