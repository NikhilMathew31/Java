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

class Age {
    int age;
    public void cal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if( age >= 18 ) {
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Not eligible to vote.");
        }
    }
}

class Palindrome {
    int n;
    int rem = 0, rev = 0;
    public void cal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        int temp = n;
        while ( n > 0 ) {
            rem = n % 10;
            rev = rev* 10 + rem;
            n = n / 10;
        }
        if ( temp == rev ) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Today: " + now);

        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println("Length of array: " + a.length);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        int[][] b = {{1,2},{3,4}};
        System.out.println("TwoD array: ");
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        Circle circle = new Circle();
        circle.get();

        Age age = new Age();
        age.cal();

        Palindrome pal = new Palindrome();
        pal.cal();
    }
}
