import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(1, "apple");
        tmap.put(3, "banana");
        tmap.put(24, "cat");
        tmap.put(12, "dog");
        tmap.put(10, "egg");
        tmap.put(15, "fish");
        Object tmap2=tmap.clone();

        System.out.println(tmap.size());

        System.out.println(tmap.firstEntry());

        System.out.println(tmap.values());

        System.out.println(tmap.containsKey(1));

        System.out.println(tmap.containsValue("cat"));

        System.out.println(tmap.entrySet());

        System.out.println(tmap.firstKey());

        System.out.println(tmap.get(3));

        System.out.println(tmap.lastEntry());

        System.out.println(tmap.lastKey());

        System.out.println(tmap.remove(1));

        System.out.println(tmap.remove(3, "a"));
        System.out.println(tmap.remove(3, "banana"));

        System.out.println(tmap.replace(4, "orange"));
        System.out.println(tmap.replace(12, "orange"));

        System.out.println(tmap);

        System.out.println(tmap.equals(tmap2));
        System.out.println(tmap==tmap2);
        System.out.println(tmap.hashCode());
        System.out.println(tmap2.hashCode());

        //遍历
/*
        for (Map.Entry entry : tmap.entrySet()) {
            System.out.printf("key is " + entry.getKey()+" ");
            System.out.println("value is " + entry.getValue());
        }

        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.printf("key is " + entry.getKey()+" ");
            System.out.println("value is " + entry.getValue());
        }*/


    }
}
