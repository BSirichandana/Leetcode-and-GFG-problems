class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer,Integer> m= new HashMap<>();
       int n=nums.length;
       int prefixsum= 0;
       int cnt=0;
       m.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            int rem = prefixsum % k;
            if (rem < 0) rem += k;
           
            cnt += m.getOrDefault(rem, 0);
            
            
            m.put(rem, m.getOrDefault(rem, 0) + 1);
        }
        return cnt;

    }
}