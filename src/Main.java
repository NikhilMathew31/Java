import java.util.Scanner;

class Circle {
    double area,radius;
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
    }
    public void display() {
        area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.get();
        c.display();
    }
}
