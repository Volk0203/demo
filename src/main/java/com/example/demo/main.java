public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int multiplicationResult = calculator.multiply(2, 7);
        double divisionResult = calculator.divide(11, 7);
        System.out.println("Результат умножения: " + multiplicationResult);
        System.out.println("Результат деления: " + divisionResult);
    }
}
