package ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Ejercicio1 {

    public static void main(String[] args) {
     /*
     * Write a lambda to define a Comparator which compares two integers
     * according to their closeness to an integer given externally and caught
     * in the closure of the lambda.
     * For example, if the integer given is 25,then 22 should be greater than
     * 30 according to the Comparator object because 22 is closer to 25 (3 difference)
     * than 30 (5 difference). Demonstrate using this to sort an ArrayList using Java’s built-in sort method, and to construct
     * a TreeSet ordered by a Comparator of this type, and by a stream using its built-in sort method.
      */


        //variables
        Integer number = 25;

        //Create a comparator
        Comparator<Integer> comparator = (a, b) ->{
            int DifferenceA = Math.abs(number - b);
            int DifferenceB = Math.abs(number - b);
            return Integer.compare(DifferenceA, DifferenceB);
        };

        //Create a list of numbers
        List<Integer> listNumbers = Arrays.asList(66,20,56,18,19,25,30);

        //Sort the list of numbers

        listNumbers.sort(comparator);
        System.out.println(listNumbers);

        //Create a TreeSet using the Comparator which it's create
        TreeSet<Integer> treeSetNumbers = new TreeSet<>(comparator);
        treeSetNumbers.addAll(listNumbers);
        System.out.println("This is the treeSet sorted " + treeSetNumbers);




    }

}
