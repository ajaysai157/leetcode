class Solution {
    public int totalFruit(int[] fruits) {
        int left=0,maxLen=0,right=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(right<fruits.length) {
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            while(mp.size()>2){
                mp.put(fruits[left],mp.getOrDefault(fruits[left],0)-1);;
                if(mp.get(fruits[left])==0) mp.remove(fruits[left]);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}