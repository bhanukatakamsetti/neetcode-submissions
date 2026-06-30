

public class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
       HashSet<Integer> HS = new HashSet<>();
       for(int num : nums)
       {
          if (HS.contains(num)) return true;
          HS.add(num);
       }

       return false;
    }
}