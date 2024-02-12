package homework_19;

public class CalcTry {

        private static double result;

        public CalcTry() {
            result = 0;
        }

        public static double add(double x) {
            result += x;
            return result;
        }

        public static double subtract(double x) {
            result -= x;
            return result;
        }

        public static double multiply(double x) {
            result *= x;
            return result;
        }

        public static double divide(double x) {
            result /= x;
            return result;
        }

        public static void main(String[] args) {

            System.out.println(CalcTry.add(5));
            System.out.println(CalcTry.subtract(3));
            System.out.println(CalcTry.multiply(4));
            System.out.println(CalcTry.divide(0));

        }

}
