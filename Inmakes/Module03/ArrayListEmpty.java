// 2. Write A Java Program To Test An ArrayList Is Empty Or Not

import java.util.List;
import java.util.ArrayList;

public class ArrayListEmpty {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);

        System.out.println("Array Elements - " + arrayList);

        int sum = 0;

        for (Integer value : arrayList) {
            sum += value; // auto unboxing example
        }
        System.out.println("Sun of the array elements - " + sum);

        System.out.print(arrayList + " - ");
        System.out.println(arrayList.isEmpty() ? "Array is Empty" : "Array has elements");

        arrayList.clear();
        System.out.print(arrayList + " - ");
        System.out.println(arrayList.isEmpty() ? "Array is Empty" : "Array has elements");
    }

}
