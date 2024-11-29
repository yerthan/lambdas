package Exercise9;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class exercise9 {

    public static void main(String[] args) {

        HashSet<List<Integer>> hashs = new HashSet<>(List.of(
                List.of(1,2,3,4),
                List.of(10,20,30,40,50),
                List.of(50,60,70)
        ));

        Comparator<List<Integer>> size = (list1, list2) -> {
            int compareSize = Integer.compare(list1.size(), list2.size());
            if(compareSize == 0){
                int sum1 = list1.stream().mapToInt(Integer::intValue).sum();
                int sum2 = list2.stream().mapToInt(Integer::intValue).sum();
                return Integer.compare(sum2, sum1);
            }
            return compareSize;
        };

    }
}
