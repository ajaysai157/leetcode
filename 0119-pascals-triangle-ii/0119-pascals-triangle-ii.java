class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        long val=1;
        res.add((int)val);
        for(int i=1;i<=rowIndex;i++){
            val=val*(rowIndex-i+1)/i;
            res.add((int)val);
        }
        return res;
    }
}