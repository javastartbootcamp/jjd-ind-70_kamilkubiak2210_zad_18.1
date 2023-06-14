package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        int result = calculateTheSumOfTheFibonacciSequence(4_000_000);
        System.out.println(result);
    }

    public static int calculateTheSumOfTheFibonacciSequence(int limit) {
        int sum = 0;
        int prev = 1;
        int current = 2;

        while (prev <= limit) {
            if (prev % 2 == 0) {
                sum += prev;
            }

            int next = prev + current;
            prev = current;
            current = next;
        }
        return sum;
    }
}