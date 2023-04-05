/**
*  Filter: This operation selects only the elements that match a specified condition.

*   Map: This operation transforms each element of the stream into a new element using a specified function.

*   Reduce: This operation combines the elements of the stream into a single result using a specified accumulator function.

*   Count: This operation returns the count of the elements in the stream.

*   Collect: This operation accumulates the elements of the stream into a collection or other data structure.

*   forEach: This operation performs an action on each element of the stream.
⚠️ you can't work multiple time with same stream ⚠️
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(8,2,6,3,4,7));
        System.out.println(al);
        
        //Odd Number
        al.stream().forEach(i->{if(i%2!=0)System.out.print(i+" ");});
        System.out.println();

        //Even Number
        al.stream().filter(n -> n % 2 == 0).forEach(i->System.out.print(i+" "));
        System.out.println();

        Stream<Integer> streamData = al.stream();
        Stream<Integer> sortedStream = streamData.sorted();
        sortedStream.map(n->n*10).forEach(i->System.out.printf(i+" "));


    }
}
