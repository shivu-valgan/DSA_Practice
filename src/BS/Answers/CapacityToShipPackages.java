package BS.Answers;

public class CapacityToShipPackages {
    public static int shipWithinDays(int[] weights, int days) {
        int low = 0 , high = 0;
        for(int w: weights){
            high+=w;
            low = Math.max(low,w);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(shippingDays(mid,weights)<=days) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    private static int shippingDays(int cap, int[] weights){
        int weight = 0, days = 1;
        for(int w : weights){
            if(weight+w>cap){
                days++;
                weight = w;
            }
            else weight+=w;
        }
        return days;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}
