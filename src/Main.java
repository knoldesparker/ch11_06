import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Add values to list
        Integer elements[]={3,7,3,-1,2,3,7,2,15,15};
        List<Integer> integerList = new LinkedList<>(Arrays.asList(elements));

        //Calls method
        countUnique(integerList);
    }

    public static void countUnique(List<Integer> list){
        //creates a TreeSet
        Set<Integer> uniq = new TreeSet<>();

        //Add the integerlist to the TreeSet to revome dubs
        uniq.addAll(list);
        //output is the leght of the list
        System.out.println(uniq.size());
    }
}
