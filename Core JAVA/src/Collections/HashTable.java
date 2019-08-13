package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by manishasingh on 8/16/2017.
 */
public class HashTable {
    public static void main(String[] args) {

        /**
         *
         * 1. Capacity - Number of buckets in hashtable.
         *
         * 2. load factor - how full hashtable is allowed before rehashing.
         *
         * 3. threshhold - size exceed threshhold - > rehashed when capcity * loadfactor
         *
         * 4. Synchronize. But throw ConcurrentModificationException
         * */
        Hashtable hashtable = new Hashtable();

        hashtable.put("pp", null);


        System.out.println(hashtable);
    }
}
