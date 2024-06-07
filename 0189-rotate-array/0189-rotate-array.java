class Solution {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
       
           int t[]= new int[nums.length];
            for(int i=0;i<nums.length;i++){
                t[(i+k)%nums.length]=nums[i];
            }
        for(int i=0;i<nums.length;i++){
            nums[i]=t[i];
        }  

       
    }
        
    

}