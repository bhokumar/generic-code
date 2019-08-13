package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by manishasingh on 8/16/2017.
 */
public class ConcurrentHM {
    public static void main(String[] args) {
      ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
      
      concurrentHashMap.put("manisha", "singh");
      concurrentHashMap.put("manisha1", "singh1");
      concurrentHashMap.put("manisha2", "singh2");
      concurrentHashMap.put("manisha3", "singh3");
      concurrentHashMap.put("manisha4", "singh4");
      
      Set<String> i = concurrentHashMap.keySet();
      Iterator itr = i.iterator();
      
      
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
    	  itr.remove();
    	  System.out.println(concurrentHashMap.remove("manisha"));
      }
      
      
      System.out.println(concurrentHashMap);
//      String h = concurrentHashMap.putIfAbsent("manisha", "singh");
//      String h1 = concurrentHashMap.putIfAbsent("manisha", "sp");
//      
//       h = concurrentHashMap.put("manisha", "singh");
//       h1 = concurrentHashMap.put("manisha", "sp");

//        concurrentHashMap.put("kk", "singh");
//        String h =  concurrentHashMap.compute("kk", (k, val) -> fun(k));
//        String h1 =  concurrentHashMap.compute("kk", (k, val) -> fun1(k));
//
//
//      System.out.println(h + " " + h1 + " " + concurrentHashMap);
    }
    
    static String fun(String f)
    {
    	return f.length() + "";
    }
    static String fun1(String f)
    {
        return 8 + "";
    }
}
