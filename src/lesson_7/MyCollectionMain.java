package lesson_7;
import java.util.ArrayList;


public class MyCollectionMain {
    public static void main(String[] args) {
        MyCollection Arr = new MyCollection();

        {// test isEmpty
            if (Arr.isEmpty()) {
                System.out.println("Isn`t empty");
            } else {
                System.out.println("Empty");
            }
        }

        {// test add
            Arr.add("Hello");
            Arr.add("Hi");
            System.out.println(Arr);
        }

        {// test isEmpty
            if (Arr.isEmpty()) {
                System.out.println("Isn`t empty");
            } else {
                System.out.println("Empty");
            }
        }

        {// test addAll
            ArrayList array = new ArrayList();
            array.add(1);
            array.add(2);
            Arr.addAll(array);
            System.out.println(array);
            array = null;
        }

        {// test remove
            ArrayList array = new ArrayList();
            array.add(1);
            array.add(8);
            array.add(7);
            array.add(5);
            System.out.println(array);
            array.remove(3); // remove object 8
            System.out.println("after remove" + array);
            array = null;
        }

        {//test clear
            ArrayList array = new ArrayList();
            array.add(1);
            array.add(8);
            array.add(7);
            array.add(5);
            System.out.println(array);
            array.clear();
            System.out.println(array);
            array = null;
        }

        {// test Contains
            Arr.add(1);
            Arr.add(8);
            Arr.add(7);
            Arr.add(5);
            Arr.add("test");
            System.out.println(Arr);
            System.out.println(Arr.contains("test"));
        }
    }
}