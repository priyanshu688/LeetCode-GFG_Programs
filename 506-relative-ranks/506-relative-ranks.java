class Solution {
    public String[] findRelativeRanks(int[] score) {
        if (score == null) {
            return null;
        }
        String[] result = new String[score.length];
        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        for (int i = 0; i < score.length; i ++) {
            index.put(score[i], i);
        }
        Arrays.sort(score);
        String[] prizes = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = score.length - 1; i >= 0; i --) {
            int rank = score.length - 1 - i;
            if (rank < 3) {
                result[index.get(score[i])] = prizes[rank];
            }
            else {
                result[index.get(score[i])] = "" + (rank + 1);
            }
        }
        return result;
    }
}