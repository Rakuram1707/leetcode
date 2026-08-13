class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int k=n/2;
        int c=0;
        int ct=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i'||s.charAt(i)== 'o'|| s.charAt(i)== 'u'|| s.charAt(i)== 'A' || s.charAt(i)== 'E' || s.charAt(i)== 'I' || s.charAt(i)== 'O' || s.charAt(i)== 'U')
            {
                c++;
            }

        }
        for(int i=k;i<n;i++)
        {
            if(s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i'||s.charAt(i)== 'o'|| s.charAt(i)== 'u'|| s.charAt(i)== 'A' || s.charAt(i)== 'E' || s.charAt(i)== 'I' || s.charAt(i)== 'O' || s.charAt(i)== 'U')
            {
                ct++;
            }
        }
        if(ct==c)
        {
            return true;
        }
        return false;
    }
}