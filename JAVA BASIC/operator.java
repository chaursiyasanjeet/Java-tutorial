public class operator {
    public static void main(String[] args) {
        // OPERATORS
        double a = 1;
        double b = 2;
        double sum = a + b;
        double diff = a - b;
        double mul = a * b;
        double div2 = a / b;
        // % modulo give remainder
        double modulo = a % b;
        System.out.println("divide" + div2);
        System.out.println("sum" + sum);
        System.out.println("diff" + diff);
        System.out.println("multiply" + mul);
        System.out.println("remainder" + modulo);

        int num = 1;
        num += 1;
        System.out.println(num);

        // Maths class
        System.out.println("maximum of 5 & 6 is: " + Math.max(5, 6));
        System.out.println("minimum of 5 & 6 is: " + Math.min(5, 6));

        // random function->generate random value between 0 & 1
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100));
    }
}
