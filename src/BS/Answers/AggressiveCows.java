package BS.Answers;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};
        int cows = 4;
        System.out.println(aggressiveCows(stalls, cows));
    }

    private static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1, high = stalls[n-1] - stalls[0];
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(stalls,cows,mid)) low = mid+1;
            else high = mid-1;
        }
        return high;
    }

    private static boolean possible(int[] stalls, int cows, int min) {
        int last = stalls[0], noCows=1;
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-last>=min) {
                last = stalls[i];
                noCows++;
            }
            if(noCows>=cows) return true;
        }
        return false;
    }
}
