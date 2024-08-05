class Solution {
    public String kthDistinct(String[] arr, int k) {
       HashMap<String,Integer> map= new LinkedHashMap<>();
       for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);

       }
       int cnt=0;
       for(String key:map.keySet()){
        if(map.get(key)==1){
            cnt++;
        
        if(cnt==k){
            return key;
        }
        }
       }
       return "";
    }
}