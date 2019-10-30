public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String buffer = "";
            if (i % 3 == 0) {
                buffer = buffer.concat("Fizz");
            }
            if (i % 5 == 0) {
                buffer = buffer.concat("Buzz");
            }
            System.out.println(buffer.isEmpty() ? i : buffer);
        }
    }
}
