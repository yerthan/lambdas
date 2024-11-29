package Exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class exercise2 {

    public static void main(String[] args) {

        /*
        Write two programs, each of which reads in some words all on one line,
        stores them in an object referred to by a variable of type Set and then prints them out,
        each word on a separate line, using the for-each method. In one program the object should
        be of actual type HashSet, in the other of actual type TreeSet.
        * */

        //Variables
        Set<String> hasSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //create a list of String
        List<String> listString = List.of("Unicaja", "Barcelona", "Madrid","Madrid", "Baskonia", "Andorra", "Unicaja");

        //Add to the HasShet and the words it's duplicated, it will be deleted
        System.out.println("Messy HashShet : ");
        hasSet.addAll(listString);
        hasSet.forEach(word -> System.out.print(word + " "));


        //Now the TreeSet ( it's will be deleted and sorted)
        System.out.println();
        System.out.println("Sorted TreeSet : ");
        treeSet.addAll(listString);
        treeSet.forEach(word -> System.out.print(word + " "));

    }

}
