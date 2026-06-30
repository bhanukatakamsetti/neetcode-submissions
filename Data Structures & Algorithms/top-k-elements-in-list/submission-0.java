class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map< Integer , Integer > freq = new HashMap<>();
        for( int num : nums)
        {
          freq.put(num , freq.getOrDefault(num, 0) +1 );

        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> freq.get(b) -  freq.get(a) );

        heap.addAll(freq.keySet());

        int[] ans = new int[k];

        for( int i = 0 ; i < ans.length ; i++)
        {
          ans[i] = heap.poll();
        }

        return ans;


    }
}
