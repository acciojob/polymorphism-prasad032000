public class Main {
    // Task 1
    static class Product {
        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2
        Product p = new Product();

        // Task 3
        int resultTask3 = p.product(5, 3);
        System.out.println("Task 3 Result: " + resultTask3);

        // Task 4
        int resultTask4 = p.product(2, 4, 3);
        System.out.println("Task 4 Result: " + resultTask4);

        // Task 5
        double resultTask5 = p.product(2.5, 3.5);
        System.out.println("Task 5 Result: " + resultTask5);
    }
}
