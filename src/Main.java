public class Main {
    public static void main(String args[]) {
        int age = 13;
        try {
            ageValidator(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ageValidator(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
   
    }
}
