class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer > resultMap  = new HashMap<>();

       for ( int i = 0 ; i<= nums.length ; i++ )
       {
            if(resultMap.containsKey(target - nums[i]) && i!=resultMap.get(target-nums[i]))
            {   
                 int smallindex = i<resultMap.get(target-nums[i]) ? i : resultMap.get(target-nums[i]) ; 
                 int bigindex = i<resultMap.get(target-nums[i]) ? resultMap.get(target-nums[i]) : i ; 
                 return new int [] { smallindex , bigindex }; 
            }
            else
            {
                  resultMap.put(nums[i] , i) ;
            }
       }

       return new int[] {};
    }
}
