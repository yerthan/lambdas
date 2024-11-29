package Ejercicio4;

import java.util.*;
import java.util.stream.Collectors;

public class exercicse4 {
    public static void main(String[] args) {

        /*
        Modify your answer to question 3 so that it can read any lines of text,
        but only stores what represents integers. For example, the line "37 ok 150 43 end"
        would lead to 37, 150 and 43 being stored, filtering elements out in each line List
        using stream and the filter method.
        */


        //variables
        Scanner sc = new Scanner(System.in);
        Set<List<Integer>> linked = new LinkedHashSet<>();

        System.out.println("Introduce some numbers");

        while(true){
            String s = sc.nextLine().trim();
            if(s.isEmpty()){
                break;
            }

            //Filter and convert to Integer
            List<Integer> list = Arrays.stream(s.split("\\s+"))
                    .filter(word -> word.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            if(!list.isEmpty()){
                linked.add(list);
            }
        }

        if(linked.isEmpty()){
            System.out.println("is not introduced numbers");
        }else{
            System.out.println("Introduced numbers: ");
            linked.forEach(System.out::print);
        }

        sc.close();


    }
}
