class Solution {
    public int[] distributeCandies(int candies, int numPeople) {
        var distribution = new int[numPeople];
	for (var i = 0; candies > 0; candies -= ++i)
		distribution[i % numPeople] += Math.min(candies, i + 1);
	return distribution;
    }
}