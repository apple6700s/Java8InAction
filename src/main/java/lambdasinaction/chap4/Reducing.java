package lambdasinaction.chap4;
import java.util.stream.*;
import java.util.*;

import static lambdasinaction.chap4.Dish.menu;

public class Reducing{

    public static void main(String...args){
    
        List<Integer> numbers = Arrays.asList(3,4,5,1,2);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);
        
        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);
    }
}
