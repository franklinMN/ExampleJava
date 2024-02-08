//https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/?envType=daily-question&envId=2024-02-01

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray {

    public static int[][] divideArray(int[] nums, int k) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentArray = new ArrayList<>();

        Arrays.sort(nums);

        currentArray.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] - currentArray.get(currentArray.size() - 1) <= k) {
                currentArray.add(nums[i]);
            } else {
                result.add(new ArrayList<>(currentArray));
                currentArray = new ArrayList<>();
                currentArray.add(nums[i]);
            }
        }
        result.add(new ArrayList<>(currentArray));
        int totalElement = 0;
        for (List<Integer> r : result) {
            totalElement += r.size();
            System.out.println("r.size" + r.size());
        }

        int rowCount = result.size();
        int[][] resultArray = new int[rowCount][];
        int colCount = 0;

        System.out.println("Total Element : " + totalElement);
        System.out.println("Num.lenght : " + nums.length);

        if (totalElement == nums.length) {
            for (int i = 0; i < rowCount; i++) {
                List<Integer> subArray = result.get(i);
                colCount = result.get(i).size();
                for (int j = 0; j < colCount; j++) {
                    resultArray[i][j] = subArray.get(j);
                }
            }

            return resultArray;
        }

        else
            return resultArray;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {

        int[] nums = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };
        int k = 2;

        int[][] resultlist = divideArray(nums, k);

        print2DArray(resultlist);
        System.out.println("Finished");
    }

}