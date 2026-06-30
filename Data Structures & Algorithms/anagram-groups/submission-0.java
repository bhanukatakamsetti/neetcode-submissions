class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
         List<List<String>> result = new ArrayList<>();
        
      String[] sortedArr = Arrays.stream(strs).map(s -> Stream.of(s.split("")).sorted().collect(Collectors.joining())).toArray(String[]::new);

      HashSet<String> uniqueSorted = new HashSet<>(Arrays.asList(sortedArr));

      for(String s : uniqueSorted) 
      {
            List<String> tempList = new ArrayList<>();
            for (int i = 0; i < sortedArr.length; i++) 
            {
                if (s.equals(sortedArr[i])) 
                {
                    tempList.add(strs[i]);
                }
            }
            
            if (!tempList.isEmpty())
            {
                result.add(tempList);
            } 
      }

        return result;

    }
}
