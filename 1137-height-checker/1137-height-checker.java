class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []exp= new int[n];
        for(int i=0;i<n;i++){
            exp[i]=heights[i];
        }
    Arrays.sort(exp);
       for(int i=0;i<n;i++){
        System.out.println(exp[i]);
       }
       int i=0;
       int j=0;
       int cnt=0;
       while(i<n&&j<n){
        if(heights[i]!=exp[j]){
            cnt++;
            
        }
        i++;
        j++;
       }
       return cnt;
    }
}