
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();//该声明方式只能用for循环遍历
        LinkedList<Integer> llist=new LinkedList<Integer>();
        System.out.println("Initial size of ll is" + ll);
        ArrayList al = new ArrayList();

        al.add(1);
        al.add(2);
        al.add(3);

//        ArrayList al2=new ArrayList(ArrayList,al);

        // add elements to ll
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        llist.add(6);
        llist.add(7);
        llist.add(8);
        llist.add(9);
        llist.add(10);
        llist.add(11);


        //show the linked list
        System.out.println(ll);
        System.out.println(ll.size());

        //获取linked list 的第一个元素和最后一个元素
        System.out.println("first element:"+ll.getFirst());
        System.out.println("first element:"+ll.getLast());

        //删除linked list的第一个元素和最后一个元素
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        //判断linked list是否包含某个元素
        System.out.println(ll.contains(2));

        //返回linked list中某个元素的索引
        System.out.println(ll.indexOf(3));

        //在任意位置插入元素
        System.out.println(ll.set(1,"s"));


        //遍历linked list
        //For Loop Example
        for (int i=0; i<ll.size();i++) {
            System.out.println(ll.get(i));
        }

        //Advance For Loop Example
        for(Integer integ:llist) {
            System.out.println(integ);

        }

        //Iterator Example
        Iterator<Integer> crunchifyIterator = llist.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }


    }
}