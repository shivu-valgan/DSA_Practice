package ArrayPractice.Medium;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        findSubArr(arr,n);
    }

    private static void findSubArr(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int resulti=-1,resultj=-1;
        int start=-1;
        for(int i=0; i<n; i++){
            if(sum == 0){
                start = i;
            }
            sum+=arr[i];
            if(sum>max){
                max = sum;
                resulti=start; resultj=i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
        for(int i=resulti; i<=resultj; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
