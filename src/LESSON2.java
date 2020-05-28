import java.util.Scanner;
import java.util.Random;


public class LESSON2 {
    //    КАЛЬКУЛЯТОР UPDATE                   //
    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        double num1 = getNum1();
//        double num2 = getNum2();
//        char action = getAction();
//        double result = calc(num1, num2, action);
//        System.out.println("Result - " + result);
//    }
//
//    public static double getNum1() {
//        System.out.println("Please input first number: ");
//        double num1;
//        if (scanner.hasNextDouble()) {
//            num1 = scanner.nextDouble();
//        } else {
//            System.out.println("Error entering number. Try again ");
//            scanner.next();
//            num1 = getNum1();
//        }
//        return num1;
//    }
//
//    public static double getNum2() {
//        System.out.println("Please input second number: ");
//        double num2;
//        if (scanner.hasNextDouble()) {
//            num2 = scanner.nextDouble();
//        } else {
//            System.out.println("Error entering number. Try again ");
//            scanner.next();
//            num2 = getNum2();
//        }
//        return num2;
//    }
//
//    public static char getAction() {
//        System.out.println("Select an action : \n + \n - \n / \n * ");
//        char action;
//        if (scanner.hasNext()) {
//            action = scanner.next().charAt(0);
//        } else {
//            System.out.println("Error");
//            scanner.next();
//            action = getAction();
//        }
//        return action;
//    }

    //    public static double calc(double num1, double num2, char action) {
//        double result;
//        switch (action) {
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> result = num1 / num2;
//            default -> {
//                System.out.println("Error.Try again .");
//                result = calc(num1, num2, getAction());
//            }
//
//        }
//        return result;
//    }
    //                          Среднее арифметическое двух числе               //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число ");
//        double num1 = scanner.nextInt();
//        System.out.println("Введите второе число ");
//        double num2 = scanner.nextInt();
//        double result = (num1 + num2) / 2;
//        System.out.println("Среднее арифметическое = " + result);
//
    //                          Среднее арифметическое массива                     //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int arr[] = new int[100];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 1000);
//        }
//        int sum = 0;
//        int avarage = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            avarage = sum / arr.length;
//
//
//        }
//        System.out.println("Среднее арифметическое массива - " + avarage);
//
//    }
    //                      Задание №3                                              //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите сумму денежного вклада в гривнах ");
//        double sum = scanner.nextDouble();
//        System.out.println("Введите процент годовых ");
//        double percent = scanner.nextDouble();
//        System.out.println("Длительность вклада в днях");
//        int years = scanner.nextInt();
//        int DaysInYear = 365;
//        double result = (sum * percent * years) / (DaysInYear * 100);
//        System.out.println(result);
//
//
//    }
    //                  ПРЯМОУГОЛЬНИК                   //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите сторону - а");
//        int a = scanner.nextInt();
//        System.out.println("Введите сторону - b");
//        int b = scanner.nextInt();
//
//        String [][] sqr = new String[a][b];
//        for (int i = 0; i < a; i++){
//            for (int j = 0; j < b ; j++){
//                sqr[i][j] = "*";
//            }
//        }
//        for (int i = 1; i < a-1; i++){
//            for (int j = 1; j < b-1 ; j++){
//                sqr[i][j] = " ";
//            }
//        }
//        for (int i = 0; i < a; i++){
//            for (int j = 0; j < b ; j++){
//                System.out.print(sqr[i][j]);
//            }
//            System.out.println();
//        }
//    }
    //          КОНВЕРТ       //
    public static void main(String[] args) {
        char asterisk;
        int x;
        System.out.println("Веддите длину и высоту");
        int HorizontalSide = scanner.nextInt();
        int VerticalSide = scanner.nextInt();
        for (int i = 0; i < HorizontalSide; i++){
            for (int j = 0; j < VerticalSide; j++) {
                if (i == 0 || i == HorizontalSide - 1) {
                    asterisk = ('*');
                } else {
                    if (j == 0 || j == VerticalSide - 1) {
                        asterisk = ('*');
                    } else {
                        x = (int) Math.round((double) VerticalSide / (double) HorizontalSide * (i + 1));

                        if (j == x - 1 || j == VerticalSide - x) {
                            asterisk = ('*');
                        } else {
                            asterisk = (' ');
                        }
                    }
                }

                if (j == VerticalSide - 1) {
                    System.out.println(asterisk);
                } else {
                    System.out.print(asterisk);
                }
            }
        }
            //           Шахматный порядок          //
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 12; i++) {
//
//            if (i % 2 != 0) {
//
//                System.out.print(" ");
//
//            }
//
//            for (int j = 0; j < 4; j++) {
//
//                System.out.print("* ");
//
//            }
//
//            System.out.println();
//
//        }
//
//    }
            //                          Чётность числа              //
//    public static void main(String[] args) {
//        int num;
//        System.out.println("Введите число: ");
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        if ( num % 2 == 0 )
//            System.out.println("Число четное");
//        else
//            System.out.println("Число нечетное");
//    }
            // ПРостое или сложное число //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число ");
//        int number = scanner.nextInt();
//        int i;
//        i = 2; // счётчик начинается с единицы так как все числа делятся на 1
//        int a = 0; // счётчик остатка от деления
//        while (i <= number) { // проверка чисел
//            a = number % i;
//            if (a == 0) // если число делится на какое-то другое до самого себя то выходим из цыкла.
//                break;
//            i = i + 1; // триггер числа если break то сложное, если цикл полностью прошел то оно простое.
//        }
//        if (i < number) {
//            System.out.println("Число сложное");
//        } else {
//            System.out.println("Число простое");    // вывод
//        }
//    }
            //                      КРАТНОСТЬ                 //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите ваше число: ");
//        int number = scanner.nextInt();
//        System.out.print("Ваше число \"" + number + "\" кратно:  ");
//        for (int count = 1; count <= number/2; count++) {
//            if (number % count == 0) {
//                System.out.print(count + ", ");
//            }
//        }
//        System.out.print(number);
//    }
        }
    }




















