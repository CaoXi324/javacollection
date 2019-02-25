package mymap;


public class MyMap {
    MyEntry[] entries = new MyEntry[900];
    int size;


    //    定义put方法
    public void put(Object key, Object value) {
        MyEntry entry = new MyEntry(key, value);
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                return;
            }
        }
        entries[size++] = entry;
    }


//定义get方法

    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                return entries[i].value;
            }

        }
        return null;
    }


//定义containsKey方法

    public boolean containsKey(Object key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                return true;
            }
        }
        return false;
    }
//    定义containsValue方法

    public boolean containsValue(Object value) {

        for (int i = 0; i < size; i++) {
            if (entries[i].value.equals(value)) {
                return true;
            }
        }
        return false;
    }

//    定义replace()

    public void replace(Object key, Object value) {
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
            }
        }
    }


//    测试


}

