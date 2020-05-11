import java.util.Scanner;


public class LESSON3 {
    public static String[][] students = new String[0][];

    public static void main(String[] args) {
//                              //      Сумма чисел //
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число : ");
//        int a = scanner.nextInt();
//        int sum = 0;
//        while (a > 0) {
//            sum = sum + a % 10;
//            a = a / 10;
//        }
//        System.out.println("Сумма чисел = " +sum);
//    }

        //      Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.      //
//        Scanner scanner = new Scanner(System.in);
//        double x1, y1, x2, y2, x, y;
//        System.out.println("Введите координату X верхнего левого угла");
//        x1 = scanner.nextDouble();
//        System.out.println("Введите координату Y верхнего левого угла");
//        y1 = scanner.nextDouble();
//        System.out.println("Введите координату X нижнего правого угла");
//        x2 = scanner.nextDouble();
//        System.out.println("Введите координату Y нижнего правого угла");
//        y2 = scanner.nextDouble();
//        System.out.println("Введите координату X произвольной точки.");
//        x = scanner.nextDouble();
//        System.out.println("Введите координату Y произвольной точки.");
//        y = scanner.nextDouble();
//        if (x >= x1 & x <= x2 & y <= y1 & y >= y2) {
//            System.out.println("Ваши координаты " + "(" + x + "; " + y + ") принадлежат прямоугольнику");
//        } else {
//            System.out.println("Ваши координаты " + "(" + x + "; " + y + ") вне прямоугольника");
//        }


        //              Студенты группы             //
        System.out.println("Chose command : add , print");
        String readOption = readLine();
        while (!(readOption.equals("exit"))) {
            switch (readOption) {
                case "add":
                    addStudents();
                    break;
                case "print":
                    printStudents();
                    break;
                case "addMark":
//                    addMark();
            }
            System.out.println("Choose command");
            readOption = readLine();
        }
    }

    public static void addStudents() {
        String[][] newStudents = new String[students.length + 1][];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;

        String surname;
        String group;
        String[] student = new String[2];
        System.out.println("Input surname");
        student[0] = readLine();
        System.out.println("Input group");
        student[1] = readLine();
        students[students.length - 1] = student;
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        return option;
    }


    public static void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0] + " " + students[i][1]);
        }
    }
}