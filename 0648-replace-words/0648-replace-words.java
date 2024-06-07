class Solution {
    public String replaceWords(List<String> d, String sentence) {
        String [] s= sentence.split(" ");
        for(int i=0;i<d.size();i++){
            int k=d.get(i).length();
           
            for(int j=0;j<s.length;j++){
                String sb="";
                if(s[j].length()>=k)sb=s[j].substring(0,k);
                
                if((d.get(i)).equals(sb)){
                    s[j]=d.get(i);
                }
            }
        }
        String ans="";
        for(int i=0;i<s.length-1;i++){
            ans+=s[i]+" ";

        }
        ans+=s[s.length-1];
        return ans;
    }
}