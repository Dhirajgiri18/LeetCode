class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        if(n <= 0) return result;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i =1; i<n; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j< prevRow.size(); j++){
                row.add(prevRow.get(j) + prevRow.get(j-1));
            }
            row.add(1);
            result.add(row);
        }
        return result;

    }
}