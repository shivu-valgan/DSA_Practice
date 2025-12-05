package ArrayPractice.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionAndInterSection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) arr1[i]=in.nextInt();
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) arr2[i]=in.nextInt();

        List<Integer> unionArr = findUnion(arr1,arr2,n1,n2);
        System.out.println(unionArr);

        List<Integer> interSection = findIntersection(arr1,arr2,n1,n2);
        System.out.println(interSection);
    }

    private static List<Integer> findIntersection(int[] arr1, int[] arr2, int n1, int n2) {
        List<Integer> interSection = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
                interSection.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return interSection;
    }

    private static List<Integer> findUnion(int[] arr1, int[] arr2, int n1, int n2) {
        List<Integer> unionArr = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n1 && j< n2){
            if(arr1[i]<arr2[j]){
                if(unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=arr1[i]){
                    unionArr.add(arr1[i]);
                    i++;
                }
            }
            else if(arr2[j]<arr1[i]){
                if(unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=arr2[j]){
                    unionArr.add(arr2[j]);
                    j++;
                }
            }
            else{
                if(unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=arr1[i]) {
                    unionArr.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        while (i<n1){
            unionArr.add(arr1[i]);
            i++;
        }
        while (j<n2){
            unionArr.add(arr2[j]);
            j++;
        }

        return unionArr;
    }
}
