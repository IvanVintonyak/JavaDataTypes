package generics;

import java.util.LinkedList;

public class Storage<T> {


    private T obj;
    LinkedList<T> list = new LinkedList<>();

    public void putObject(T obj) {
        list.add(obj);
    }

    public <T> void getLastObjAndRemoveObj() {
        System.out.println(list.getLast());
        list.removeLast();
    }
}
