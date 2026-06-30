class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if( s.length()!=t.length())
        {
           return false ;
        }
        else
        {  
         char[] sorted_s = s.toCharArray(); 
         char[] sorted_t = t.toCharArray(); 

         Arrays.sort(sorted_s); 
         Arrays.sort(sorted_t); 

         String S = new String(sorted_s);
         String T = new String(sorted_t);

         if(S.equals(T))
         {
            return true ; 
         }
         else 
         {
            return false;
         }
        }

        
    }; 
}
