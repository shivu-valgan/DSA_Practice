package BS.Answers;

public class MinDaysToMakeBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<((long)m*(long)k)) return -1;
        int low = Integer.MAX_VALUE, high=Integer.MIN_VALUE;
        for(int b: bloomDay){
            low = Math.min(low,b);
            high = Math.max(high,b);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(bouquetN(bloomDay,mid,k)>=m) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    private static int bouquetN(int[] bloomDay,int days, int k){
        int flowers = 0, bouquets=0;
        for(int b: bloomDay){
            if(days>=b){
                flowers++;
            }
            else{
                bouquets += flowers/k;
                flowers = 0;
            }
        }
        bouquets += flowers/k;
        return bouquets;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3, k=1;
        System.out.println(minDays(bloomDay,m,k));
    }
}
