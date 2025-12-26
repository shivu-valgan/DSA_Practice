package BS.Answers;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = -1;
        for(int p: piles) high = Math.max(p,high);
        while(low<=high){
            int mid = (low+high)/2;
            if(findTotalHrs(piles,mid,h)){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
    private static boolean findTotalHrs(int[] piles, int k, int h){
        int totalHrs = 0;
        for(int ele: piles){
            totalHrs+=(ele+k-1)/k;
            if(totalHrs>h) return false;
        }
        return totalHrs<=h;
    }

    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        int k = minEatingSpeed(piles,h);
        System.out.println(k);
    }
}
