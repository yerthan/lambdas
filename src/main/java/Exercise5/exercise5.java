package Exercise5;

import java.util.*;
import java.util.stream.Collectors;

public class exercise5 {
    public static void main(String[] args) {

        /*
        * Write a modified version of your answer to question 3 or 4 where
        * each line of integers is stored in an object of type Set, and the representation
        * of each line is stored in an object of type List. Compare what is printed at the
        * end with what is printed in the answers to question 3 and 4 when some integers are
        * duplicated on a line and when some lines are identical to other lines.
         *
        * */

        //variables
        Scanner sc = new Scanner(System.in);
        List<Set<Integer>> list = new ArrayList<>();

        System.out.println("Introduce some numbers");
        String l = sc.nextLine();

        //Filter whith the stream
        while(!(l = sc.nextLine()).isEmpty()){
            Set<Integer> set = Arrays.stream(l.split("\\s"))
                    .filter(number -> number.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());
            list.add(set);
        }

        //print the list
        System.out.println("This is the list : ");
        list.forEach(set -> System.out.println(set.toString()));

        //Compares results when is duplicated

        System.out.println("\nCompared : ");
        for (int i = 0; i < list.size(); i++) {
            Set<Integer> set = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                if(set.equals(list.get(j))){
                    System.out.println("Line " + (i +1) + " is equal to " + (j +1));
                }
            }
        }

    }
}
