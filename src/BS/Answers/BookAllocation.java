package BS.Answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookAllocation {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(12, 34, 67, 90));
        int n = 4;
        int m = 2;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }

    private static int findPages(List<Integer> arr, int n, int m) {
        int low = Collections.max(arr), high = 0;
        for(int ele: arr){
            high += ele;
        }
        while (low<=high){
            int mid = low+(high-low)/2;
            if(canHold(arr,m,n,mid)) high = mid-1;
            else low = mid+1;
        }
        return low;

    }

    private static boolean canHold(List<Integer> arr, int students, int n, int pages) {
        int studentPages = 0, student=1;
        for(int i=0; i<arr.size(); i++){
            if(studentPages+arr.get(i)<=pages){
                studentPages+=arr.get(i);
            }
            else {
                student++;
                studentPages = arr.get(i);
            }
            if(student>students) return false;
        }
        return students==student;

    }
}
