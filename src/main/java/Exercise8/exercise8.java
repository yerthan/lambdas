package Exercise8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class exercise8 {
    public static void main(String[] args) {

        /**
         * Modify your answer to question 3 to store the set
         * of lists of integers as a TreeSet object with an ordering given by the second Comparator
         * object of question 7. Then also store the set of lists of integers as a TreeSet object with
         * an ordering given by the first Comparator object of question 7. Compare the results.
         */

        //Variables
        HashSet<List<Integer>> hash = new HashSet<>(List.of(
                List.of(1, 2, 3),
                List.of(10, 20, 30, 40),
                List.of(11, 21, 31, 41)
        ));

        //implements the comparator
        Comparator<List<Integer>> lenght = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> sum = Comparator.comparingInt(list -> list.stream()
                .mapToInt(Integer::intValue)
                .sum());


        //Create 2 list with the comparators
        List<Integer> sum2 = Collections.max(hash, sum);
        List<Integer> lenght2 = Collections.max(hash, lenght);


        //print the result of the lists
        System.out.println("By the sum : " + sum2);
        System.out.println("By the lenght : " + lenght2);

        sum2 = hash.stream().max(sum).orElse(Collections.emptyList());
        lenght2 = hash.stream().max(lenght).orElse(Collections.emptyList());

        //Print the result one more time

        System.out.println("Once the Stream");
        System.out.println("By the sum : " + sum2);
        System.out.println("By the lenght : " + lenght2);


    }

}
