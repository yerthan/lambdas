package Exercise6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class exercise6 {

    public static void main(String[] args) {

        /*
        * Write your own static method that will take a
        * HashSet object and return from it the List object
        * within it that is the longest using the reduce method of
        * corresponding stream. If the HashSet is empty, it should
        * return an empty List object. Use this method with the HashSet
        * object created in the answer to question 3.
        * */


        //Variables
        HashSet<List<Integer>> lists = new HashSet<>(List.of(
                List.of(11, 22, 33, 44, 55),
                List.of(11, 21, 31, 41, 51, 61),
                List.of(12, 22, 33, 44),
                List.of(13, 23, 33, 43, 53, 63, 73),
                List.of(14, 24, 34, 44, 54)
        ));

        System.out.println(Sum(lists));
    }

    private static List<Integer> Sum(HashSet<List<Integer>> lists) {
        return lists.stream()
                .reduce((list1, list2) -> sumList(list1) > sumList(list2) ? list1 : list2)
                .orElse(new ArrayList<>());
    }

    private static int sumList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
