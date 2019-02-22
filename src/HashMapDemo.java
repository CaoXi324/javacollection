import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        HashMap<Integer, String> hmap3 = new HashMap<Integer, String>();

        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(12, "Chaitanya");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        hmap3.put(1, "Anuj");
        hmap3.put(2, "Anub");
        hmap3.put(3, "Anuc");
//Object clone()
        System.out.println(hmap.isEmpty());//false
        Object hmap2 = hmap.clone();
        System.out.println(hmap2); //{49=Ajeet, 2=Rahul, 3=Anuj, 12=Chaitanya, 7=Singh}

//        void putAll(Map map)
        hmap.putAll(hmap3);
        System.out.println(hmap); //{49=Ajeet, 1=Anuj, 2=Anub, 3=Anuc, 7=Singh, 12=Chaitanya}

//       boolean remove(Object key, Object value)
        hmap.remove(1, "Anuj");
        System.out.println(hmap);//{49=Ajeet, 2=Anub, 3=Anuc, 7=Singh, 12=Chaitanya}

//        boolean containsValue(Object value)
        System.out.println(hmap.containsValue("Anub"));//true

//        boolean containsKey(Object key)
        System.out.println(hmap.containsKey(1));//false

//          boolean equals(Object o)
        System.out.println(hmap.equals(hmap3));//false

//        V get(Object key)
        System.out.println(hmap.get(2));//Anub

//        V getOrDefault(Object key, V defaultValue)
        System.out.println(hmap.getOrDefault(3, "a"));//Anuc
        System.out.println(hmap.getOrDefault(3, ""));//Anuc
        System.out.println(hmap.getOrDefault(4, ""));//无输出
        System.out.println(hmap.getOrDefault(4, "Anuc"));//Anuc
        System.out.println(hmap.getOrDefault(4, "a4"));//a4

//        Collection values()
        System.out.println(hmap.values());//[Ajeet, Anub, Anuc, Singh, Chaitanya]

        //遍历

        for (Map.Entry entry : hmap.entrySet()) {
            System.out.printf("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }


        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.printf("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());

        }
    }
}
