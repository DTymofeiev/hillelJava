package lesson_4;

public class Mark {
    private Subject subject;
    private byte value;

    public Mark(Subject subject, Byte value) {
        this.subject = subject;
        this.value = value;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "subject=" + subject +
                ", value=" + value +
                '}';
    }
}

