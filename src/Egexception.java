public class Egexception {

        public static void main(String[] args) {

            try {
                int a = 10;
                int b = 0;
                System.out.print(a/b);
            }
            catch(ArithmeticException e) {
                System.out.println("Cant divide a number by zero");
            }

            try {
                int num = Integer.parseInt("Hello");
                System.out.print(num);
            }
            catch(NumberFormatException e) {
                System.out.println("It contains non-numeric characters");
            }

            try {
                int[] a = new int[5];
                a[6] = 6;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out of bound");
            }

        }
}

