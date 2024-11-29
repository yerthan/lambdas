package Exercise9;

import java.util.*;

public class exercise9 {

    public static void main(String[] args) {

        HashSet<List<Integer>> hashs = new HashSet<>(List.of(
                List.of(1,2,3,4),
                List.of(10,20,30,40,50),
                List.of(50,60,70)
        ));

        // This comparator sorts the lists by size, and if they have the same size,
        // it sorts them by the sum of their elements in descending order.
        Comparator<List<Integer>> size = (list1, list2) -> {
            int compareSize = Integer.compare(list1.size(), list2.size());
            if(compareSize == 0){
                int sum1 = list1.stream().mapToInt(Integer::intValue).sum();
                int sum2 = list2.stream().mapToInt(Integer::intValue).sum();
                return Integer.compare(sum2, sum1);
            }
            return compareSize;
        };

        //This comparator sorts the lists by the sum of their elements,
        // and if the sums are equal, it sorts them by size in descending order.

        Comparator<List<Integer>> sum = (list1, list2) -> {
            int compareSum = Integer.compare(list1.stream()
                    .mapToInt(Integer::intValue)
                    .sum(),
                    list2.stream().mapToInt(Integer::intValue).sum());

            if(compareSum == 0){
                return Integer.compare(list2.size(), list1.size());
            }
            return compareSum;
        };

        // These lines find the list with the maximum sum of elements (sumList)
        // and the list with the maximum size (sizeList) from the 'hashs' collection,
        // using the respective comparators for sum and size.
        List<Integer> sumList = Collections.max(hashs, sum);
        List<Integer> sizeList = Collections.max(hashs, size);

        //Print the result
        System.out.println("By the sum : " + sumList);
        System.out.println("By the size : " + sizeList);

        //These lines find the lists with the maximum sum and size from the 'hashs' collection using streams.
        // If no maximum is found, an empty list is returned.
        sumList = hashs.stream().max(sum).orElse(Collections.emptyList());
        sizeList = hashs.stream().max(size).orElse(Collections.emptyList());

        //print the result
        System.out.println("By the sum and the size : " + sumList);
        System.out.println("By the size and sum : " + sizeList);



    }
}
