package lesson_8;

public class Element {
    private Object data;

    public Element(Element next,Object data) {
        this.data = data;
        this.next = next;
    }

    public Element getNext() {

        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Element next;

}

