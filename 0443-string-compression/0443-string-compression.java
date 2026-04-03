class Solution {
    public int compress(char[] chars) {
        char curr=chars[0];
        int count=0,j=0;
        for(int i=0;i<chars.length;i++){
            if(curr==chars[i]){
                count++;
            }else{
                chars[j++]=curr;
                if(count>1){
                    String str=Integer.toString(count);
                    for(char c:str.toCharArray()){
                        chars[j++]=c;
                    }
                }
                curr=chars[i];
                count=1;
            }
        }
        chars[j++]=curr;
        if(count>1){
            String str=Integer.toString(count);
            for(char c:str.toCharArray()){
                chars[j++]=c;
            }
        }
        return j;
    }
}