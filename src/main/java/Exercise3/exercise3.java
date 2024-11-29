package Exercise3;

import java.util.*;

public class exercise3 {

    public static void main(String[] args) {
        /*
         *Write a program that reads several lines of text consisting only of integers.
         *The integers in each line should be stored in an object of type List
         * (integers are separated by spaces), and this representation of each line should be stored
         * in an object of type HashSet. Then the program should print out the contents of this set
         * using forEach method for the object of type List, and the forEach for the object of type HashSet.
         */

        //variables

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        Set<List<Integer>> hashSet = new HashSet<>();


        System.out.println("Introduce some words");
        String word;
        while (true) {
            word = sc.nextLine().trim();
            if (word.isEmpty()) {
                break;
            }
        }


        //Convert the words on Integers
        String[] numbers = word.split(" ");
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }

        hashSet.add(list);

    }
}
