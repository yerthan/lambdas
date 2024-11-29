package exercise7;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class exercise7 {

    public static void main(String[] args) {

        //variables
        HashSet<List<Integer>> lists = new HashSet<>(List.of(
                List.of(1, 3, 5, 7),
                List.of(2,4,6,8),
                List.of(11,12,13,14,15),
                List.of(50,51,52)
        ));

        //Create some Comparator
        Comparator<List<Integer>> sum = Comparator.comparingInt(list -> list.stream()
                .mapToInt(Integer::intValue).sum());

        Comparator<List<Integer>> lenght = Comparator.comparingInt(List::size);

        List<Integer> maxSumList = Collections.max(lists, sum);

        List<Integer> maxLenghtList = Collections.max(lists, lenght);

        System.out.println(maxSumList);
        System.out.println(maxLenghtList);


        //Now we search the max result of a list
        List<Integer> listWithTheMaxResult = lists.stream()
                .max(Comparator.comparingInt(list -> list.stream()
                        .mapToInt(Integer::intValue)
                        .sum()))
                .orElse(List.of());
        System.out.println(listWithTheMaxResult);
    }

}
