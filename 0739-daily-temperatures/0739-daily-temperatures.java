class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        var st = new Stack<Integer>();
        var res = new int[n];
        if(n==0){
            res[0]=0;
            return res;
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]) {
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}