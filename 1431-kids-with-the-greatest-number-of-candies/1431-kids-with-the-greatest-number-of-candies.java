class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int highest =0;
        for(int candy : candies){
            highest = Math.max(highest,candy);
        }

       List<Boolean> result = new ArrayList<>(candies.length);

        for(int candy : candies){
            result.add(candy + extraCandies >= highest);
        }
        return result;
    }
}