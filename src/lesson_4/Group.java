package lesson_4;

import java.util.Arrays;

public class Group {
    private String name;
    private Student[] students;

    public Group(String name, int initialSize) {
        this.name = name;
        this.students = new Student[initialSize];
    }

    public Group() {
        this("n/a", 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return i;
            }
        }

        int newSize = students.length + 1;
        Student[] newStudents = new Student[newSize];
        newStudents = Arrays.copyOf(students, newSize);
        newStudents[students.length] = student;
        students = newStudents;
        return students.length;
    }

    public int hasStudentWithSurname(String surname) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return -1;
            }
            if (surname.equals(students[i].getSurname())) {
                return i;
            }
        }
        return -1;
    }

    public Student getStudentWithSurname(String surname)
            throws NoSuchStudentException {
        int i = hasStudentWithSurname(surname);
        if (i == -1) {
            throw new NoSuchStudentException("Invalid surname");
        } else {
            return students[i];
        }
    }

    public void removeStudentWithSurname(String surname)
            throws NoSuchStudentException {
        int i = hasStudentWithSurname(surname);
        if (i == -1) {
            throw new NoSuchStudentException("Invalid surname");
        } else {
            for (int j = i; j < students.length - 1; j++) {
                students[j] = students[j + 1];
            }
            setStudents(trim(students));
        }
    }

    public static Student[] trim(Student[] students) {
        Group group = new Group();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                group.addStudent(students[i]);
            }
        }
        return group.getStudents();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Group: " + getName() + "\n\t students:\n\t\t");
        for (Student student : this.students)
            if (student != null) {
                sb.append(student.toString() + "\n\t\t");
            }
        return sb.toString();
    }

    public static void main(String[] args) {

        try {

            Group group1 = new Group("A1", 3);

            group1.addStudent(new Student(
                    "Victor",
                    "Sidorov",
                    new Mark[]{
                            new Mark(
                                    new Subject("Математика"),
                                    (byte) 100
                            )
                    },
                    new Visit[]{
                            new Visit("2020-20-05"),
                            new Visit("22020-21-05"),
                            new Visit("2020-22-05")

                    }
            ));


            group1.addStudent(new Student(
                    "Petr",
                    "Petrov",
                    new Mark[]{
                            new Mark(
                                    new Subject("Биология"),
                                    (byte) 35
                            )
                    },
                    new Visit[]{
                            new Visit("2020-20-05"),
                            new Visit("22020-21-05"),
                            new Visit("2020-22-05")

                    }
            ));


            group1.addStudent(new Student(
                    "Ivan",
                    "Ivanov",
                    new Mark[]{
                            new Mark(
                                    new Subject("Информатика"),
                                    (byte) 90
                            )
                    },
                    new Visit[]{
                            new Visit("2020-20-05"),
                            new Visit("22020-21-05"),
                            new Visit("2020-22-05")

                    }
            ));

            System.out.println(group1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}