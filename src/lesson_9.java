public class lesson_9 {
    public static void main(String[] args) {
        System.out.println(calculateFib(45));
    }

    private static long[] fib = new long[100];

    private static long calculateFib(int number) {
        if (fib[number] != 0)
            return fib[number];
        else if (number == 0 || number == 1 || number == 2) {
            fib[number] = 1;
            return 1;
        } else {
            long res = calculateFib(number - 2) + calculateFib(number - 1);
            fib[number] = res;
            return res;
        }
    }
}
