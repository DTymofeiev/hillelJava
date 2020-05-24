package lesson_7;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

    public class MyCollection implements Collection {

        private Object[] Array = new Object[0];

        @Override
        public int size() {
            int size;
            return size = Array.length;
        }

        @Override
        public boolean add(Object Object) {

            Object[] newArray = new Object[Array.length + 1];
            for (int i = 0; i < Array.length; i++) {
                newArray[i] = Array[i];
            }
            newArray[Array.length] = Object;
            Array = newArray;

            return false;
        }

        @Override
        public String toString() {
            String result = "";
            for (Object o : Array) {
                result += (" " + o.toString());
            }
            return result;
        }

        @Override
        public boolean isEmpty() {
            boolean bool;
            if (Array.length == 0) {
                bool = false;
            } else {
                bool = true;
            }
            return bool;
        }

        @Override
        public boolean contains(Object object) {
            boolean isContains = false;
            for(int i = 0; i < Array.length; i++){
                if(Array[i] == object){
                    isContains = true;
//                System.out.println("Contains");
                }else {
                    isContains = false;
//                System.out.println("Not contains");
                }
            }
//        System.out.println(isContains);
            return isContains;
        }



        @Override
        public boolean remove(Object object) {
            Object[] newArray = new Object[Array.length];
            for(int i =0; i < Array.length; i++){
                if(Array[i] == object){
                    newArray[i] = null;
                }else{
                    newArray[i] = Array[i];
                }
            }
            Array = newArray;
            return false;
        }

        @Override
        public boolean addAll(Collection c) {
            Object[] toAddAll = c.toArray();
            for(Object obToAdd : toAddAll){
                add(obToAdd);
            }
            return false;
        }

        @Override
        public void clear() {
            Array = null;

        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }
    }