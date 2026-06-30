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
            duplicateIdentifier.put(num , duplicateIdentifier.get(num)+1); 
            return true ; 
         }
      }

      return false ; 

    }  
}