class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> m= new HashMap<>();
        int sum=0;
        m.put(0,-1);
        for(int i=0;i<n;i++){
             sum+=nums[i];
             int rem=sum%k;

             if(m.containsKey(rem)){
                 if(i-m.get(rem)>1){
                    return true;
                 }
             }


            else  m.put(rem,i);

        }
        return false;
    }
}