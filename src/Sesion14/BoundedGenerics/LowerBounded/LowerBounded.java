package Sesion14.BoundedGenerics.LowerBounded;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

    public static void addHello(List<? super String> list){
        list.add("hello");
    }
    public static void main(String[] args){
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        addHello(strings);

        List<Object> objects = new ArrayList<Object>(strings);
        addHello(objects);

        List<? super IOException> exceptions = new ArrayList<Exception>();

        List<Exception> list=new ArrayList<>();
        list.add(new Exception());
        list.add(new IOException());
        list.add(new FileNotFoundException());

        exceptions = list;

        exceptions.add(new FileNotFoundException());
        exceptions.add(new IOException());
        //exceptions.add(new Exception());


    }
}
