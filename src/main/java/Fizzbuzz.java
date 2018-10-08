public class Fizzbuzz {
    public static String of(int number) {
        if (number <= 0) throw new IllegalArgumentException("Number must be within 1 to 100");
        if (number % 3 == 0) return "Fizz";
        return "1";
    }
}

