package lesson_5;

public class Test {
    public static void main(String[] args) {
        int i = 1;
        int[] anothercontainer = {2, 12, 13, 22, 4, 65};

        MyArray numbersInArray = new MyArray();

        numbersInArray.add(i);
        numbersInArray.add(35);
        numbersInArray.add(14);
        numbersInArray.add(10);
        numbersInArray.add(7);

        numbersInArray.addAll(anothercontainer);

        print("is equal: " + numbersInArray.equals(anothercontainer));

        print(numbersInArray.get(7));

        print("if countains: " + i + " " + numbersInArray.contains(i));
        print("if countains: " + 100 + " " + numbersInArray.contains(100));

        numbersInArray.sort();
        print("sorted: " + numbersInArray.toString());

        print("size: " + numbersInArray.getSize());

        print("index of i: " + numbersInArray.indexOf(i));

        print("");

        numbersInArray.clear();


    }

    static void print(Object o) {
        System.out.println(o);
    }
}
