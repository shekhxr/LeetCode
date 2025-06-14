class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(cardPoints == null || cardPoints.length == 0 || k == 0) {
            return 0;
        }

        int maxPoints = 0;
        int lsum = 0;
        int rsum = 0;

        for(int i=0;i<k;i++) {
            lsum += cardPoints[i];
        }
        
        maxPoints = lsum;
        int r = cardPoints.length - 1;
        for(int i=k-1;i>=0;i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            maxPoints = Math.max(lsum + rsum, maxPoints);
            r--;
        }
        

        return maxPoints;
    }
}
