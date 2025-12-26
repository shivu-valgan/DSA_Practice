package BS.Answers;

public class SquareRoot {
    public static int findSquareRoot(int n){
        int low = 1, high = n;
        int sqrt = 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid<=n){
                sqrt = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println(findSquareRoot(n));
    }
}
