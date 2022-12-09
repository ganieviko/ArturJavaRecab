package InterviewPreparation;
import java.util.*;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>();
        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // Adding the duplicate
        // element
//        ts.add("India");
        String first = ts.first();

        // Displaying the TreeSet
        System.out.println(ts);
        System.out.println(first);

        Iterator<String> i = ts.iterator();
            while (i.hasNext()){
                System.out.println(i.next());
        }
    }
}
