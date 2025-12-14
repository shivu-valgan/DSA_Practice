package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RowNum = in.nextInt();
        List<List<Integer>> list = generate(RowNum);
        System.out.println(list);
    }

    private static List<List<Integer>> generate(int rowNum) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=1; i<=rowNum; i++){
            List<Integer> row = generateRow(i);
            pascal.add(row);
        }
        return pascal;
    }

    private static List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(ans);
        for(int i=1; i<row; i++){
            ans = ans*(row-i)/i;
            list.add(ans);
        }
        return list;
    }
}
