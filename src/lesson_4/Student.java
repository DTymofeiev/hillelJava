package lesson_4;

public class Student {
    public String name;
    public String surname;
    public int [] marks;


    public Student(String name, String surname, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = surname;
    }

    public void setMark(int lessonNumber, int mark) {
        if (marks.length >= lessonNumber && mark >= 0) {
            marks[lessonNumber - 1] = mark;
        }
    }


    public String toString() {
        String string = name;
        string = string + " " + surname;
        if (marks != null) {
            for (int mark : marks) {
                string = string + " " + mark;
            }
        }
        return string;
    }


}

