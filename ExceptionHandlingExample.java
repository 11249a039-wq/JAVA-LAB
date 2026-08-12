public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero.");
            System.out.println("Exception Message: " + e.getMessage());
        } 
        finally {
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}