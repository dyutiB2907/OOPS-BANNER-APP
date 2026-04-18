public class EvenOddChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 28;

        System.out.println(number1 + " is even? " + isEven(number1));
        System.out.println(number2 + " is even? " + isEven(number2));
    }
}