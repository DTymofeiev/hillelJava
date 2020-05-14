package lesson_4;

import java.util.Scanner;

public class MainStudentsGroup {


    static Group[] groups = new Group[1];

    public static void main(String[] args) {
        groups[0] = new Group("Group", new Student[0]);
        System.out.println("Chose command.");
        String readOption = readOption();
        while (!(readOption.equals("exit"))) {
            switch (readOption) {
                case "add":
                    addStudent();
                    break;
                case "get":
                    getStudent();
                    break;
                case "contains":
                    containsStudent();
                    break;
                case "remove":
                    removeStudent();
                    break;
                case "getListSize":
                    getSizeArray();
                    break;
                case "print":
                    print();
                    break;
            }
            System.out.println("Choose command");
            readOption = readOption();
        }
    }

    public static String readOption() {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        return option;
    }

    public static Student readStudent() {
        System.out.println("Input surname");
        String surname = readOption();
        System.out.println("Input name");
        String name = readOption();

        Student student = new Student(surname, name, null);
        return student;
    }

    public static Group createGroup(String nameOfGroup) {
        Group[] newGroup = new Group[groups.length + 1];
        for (int j = 0; j < groups.length; j++) {
            newGroup[j] = groups[j];
        }
        newGroup[groups.length] = new Group(nameOfGroup, new Student[0]);
        groups = newGroup;
        return groups[groups.length - 1];
    }

    public static Group getGroupByName(String nameOfGroup) {
        for (int i = 0; i < groups.length; i++) {
            if (nameOfGroup.equals(groups[i].getGroupName()))
                return groups[i];
        }
        return null;
    }

    public static void addStudent() {
        Student student = readStudent();
        System.out.println("Input group.");
        String nameOfGroup = readOption();
        Group group = getGroupByName(nameOfGroup);
        if (group == null) {
            group = createGroup(nameOfGroup);
        }
        group.add(student);
    }

    public static void getStudent() {
        System.out.println("Input group");
        String group = readOption();
        System.out.println("Input index");
        int index = Integer.parseInt(readOption());
        Student student;
        for (int i = 0; i < groups.length; i++) {
            if (group.equals(groups[i].getGroupName()) && groups[i].getGroupList().length > index) {
                student = groups[i].getStudentByIndex(index);
                System.out.println(student);
                return;
            }
        }
        System.out.println("Empty index");
    }

    public static void containsStudent() {
        Student student = readStudent();
        System.out.println("Input group");
        String group = readOption();
        boolean result = false;
        for (int i = 0; i < groups.length; i++) {
            if (group.equals(groups[i].getGroupName())) {
                result = groups[i].contains(student.getSurname(), student.getName());
                break;
            }
        }
        if (result) {
            System.out.println("Student is in the group");
        } else {
            System.out.println("There is no such student in the group");
        }
    }

    public static void removeStudent() {
        Student student = readStudent();
        System.out.println("Input group");
        String group = readOption();
        for (int i = 0; i < groups.length; i++) {
            if (group.equals(groups[i])) {
                groups[i].remove(student.getSurname(), student.getName());
                break;
            }
        }
    }

    public static void getSizeArray() {
        System.out.println("Input group");
        String group = readOption();
        for (int i = 0; i < groups.length; i++) {
            if (group.equals(groups[i].getGroupName())) {
                System.out.println(groups[i].getGroupList().length);
                break;
            }
        }
    }

    public static void print() {
        for (int i = 0; i < groups.length; i++) {
            System.out.println(groups[i].getGroupName());
            for (int j = 0; j < groups[i].getGroupList().length; j++) {
                System.out.println(groups[i].getGroupList()[j]);
            }
        }
    }
}

