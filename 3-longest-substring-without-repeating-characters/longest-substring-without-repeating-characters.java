class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap <Character,Integer> map= new HashMap<>();
        int left=0;
        int high=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                left=Math.max(left,map.get(c)+1);

            }
            map.put(c,i);
            int currentLength=i-left+1;
            high=Math.max(high,currentLength);

        }
        return(high);
    }
}