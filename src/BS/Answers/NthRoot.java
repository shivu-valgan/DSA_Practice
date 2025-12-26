package BS.Answers;

public class NthRoot {
    public static int findNthRoot(int num, int root){
        int low = 1, high = num;
        while(low<=high){
            int mid = (low+high)/2;
            int midN = nPow(mid,root,num);
            if(midN==1) return mid;
            else if(midN == 2) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

    private static int nPow(int base, int pow, int num) {
        long ans = 1L;
        for(int i=1; i<=pow; i++){
            ans = ans*base;
            if(ans>num) return 2;
        }
        if(ans==num) return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findNthRoot(625,4));
    }
}
