class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int num = 1<<n;
        for(int i = 0; i < num; i++) {
            res.add((i>>1)^i);
        }
        return res;
    }
}