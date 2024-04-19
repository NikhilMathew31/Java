import java.util.Scanner;
import java.util.Date;

class Circle {
    double area,radius;
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Today: " + now);

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Length of array: " + arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[][] a = {{1,2},{3,4}};
        System.out.println("TwoD array: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        Circle c = new Circle();
        c.get();

    }
}
