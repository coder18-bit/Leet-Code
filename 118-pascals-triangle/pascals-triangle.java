class Solution {
    public List<Integer> generateRow(int row){
        int ans =1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);
        for(int i=1;i<row;i++){
            ans = ans*(row-i);
            ans = ans/i;
            ansrow.add(ans);
        }
        return ansrow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}