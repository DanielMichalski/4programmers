package pl.programmers.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Daniel
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<Worker>();

        workers.add(new Worker(3, "name1", "surname1"));
        workers.add(new Worker(4, "name2", "surname2"));
        workers.add(new Worker(1, "name3", "surname4"));
        workers.add(new Worker(5, "name4", "surname5"));
        workers.add(new Worker(2, "name5", "surname6"));

        Collections.sort(workers);

        System.out.println("Sortowanie po id z uzyciem interfejsu Comparable:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
