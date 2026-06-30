class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
      HashMap<Integer, Integer> duplicateIdentifier = new HashMap<>();

      for( int num : nums)
      {
         if(duplicateIdentifier.containsKey(num)==false)
         {  
            duplicateIdentifier.put(num , 1); 
         }
         else 
         {
            return true ; 
         }
      }

      return false ; 

    }  
}