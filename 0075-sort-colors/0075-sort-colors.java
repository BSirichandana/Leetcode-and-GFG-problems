class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
      int low=0;
      int high=n-1;
      int mid=0;
      while(mid<=high){
          if(nums[mid]==0){
              swap(mid,low,nums);
              low++;
              mid++;
          }
          else if(nums[mid]==1){
           mid++;
          }
          else{
              swap(mid,high,nums);
              high--;
          }
          
      }

    }
    void swap(int i,int j,int [] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}