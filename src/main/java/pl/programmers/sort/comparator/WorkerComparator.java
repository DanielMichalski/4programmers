package pl.programmers.sort.comparator;

import java.util.Comparator;

/**
 * Author: Daniel
 */
public class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        if (o1.getId() > o2.getId()) return 1;
        if (o1.getId() < o2.getId()) return -1;
        return 1;
    }
}
