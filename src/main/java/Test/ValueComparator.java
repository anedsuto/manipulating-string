package Test;

import java.util.Comparator;
import java.util.Map;


public class ValueComparator implements Comparator<Character> {
    Map<Character,Integer> localInstance;

    public ValueComparator(Map<Character, Integer> localInstance) {
        this.localInstance = localInstance;
    }

    @Override
    public int compare(Character o1, Character o2) {
        return localInstance.get(o1) <= localInstance.get(o2) ? 1 : -1;
    }
}
