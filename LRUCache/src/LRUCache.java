import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {

    static Deque<Integer> keysOfCaches;
    static HashSet<Integer> referencesOfKeysInCache;
    static int maxCapacity;

    /**
     * Create cache object with list of keys and set of references to those keys.
     *
     * @param n maximum capacity of cache
     */
    LRUCache(int n) {
        keysOfCaches = new LinkedList<>();
        referencesOfKeysInCache = new HashSet<>();
        maxCapacity = n;
    }

    public static void main(String[] args) {
        LRUCache ca = new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

    public void refer(int x) {
        if (!referencesOfKeysInCache.contains(x)) {
            if (keysOfCaches.size() == maxCapacity) {
                int last = keysOfCaches.removeLast();
                referencesOfKeysInCache.remove(last);
            }
        } else {
            int index = 0, i = 0;
            for (Integer key : keysOfCaches) {
                if (key == x) {
                    index = i;
                    break;
                }
                i++;
            }
            keysOfCaches.remove(index);
        }
        keysOfCaches.push(x);
        referencesOfKeysInCache.add(x);
    }

    public void display() {
        for (Integer key : keysOfCaches) {
            System.out.print(key + " ");
        }
    }
}
