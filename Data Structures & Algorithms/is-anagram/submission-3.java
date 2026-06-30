class Solution {
    public boolean isAnagram(String s, String t)     {      
          int count = 0;

          HashSet<Character> set = new HashSet<>();

           String longer = s.length() >= t.length() ? s : t;

           for ( char c : longer.toCharArray())
           {
                set.add(c);
           }

           for( char c : set)
           {
                if( s.contains("" + c) && t.contains("" + c))
                {
                    if( s.chars().filter(ch -> ch == c ).count() == t.chars().filter(ch -> ch == c ).count())
                    {   
                        count++;
                    }
                }
           }

           return  count == set.size()  ; 
    }
}
