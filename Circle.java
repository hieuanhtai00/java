
import java.util.Scanner;

public class Circle {
    private float Radius;
    private String Color;

    Circle() {
    }

    Circle(float Radius, String Color) {
        this.Radius = Radius;
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public float getRadius() {
        return Radius;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }

    void ShowInformation() {
        System.out.println("Radius : " + Radius + "\nColor : " + Color);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Input Radius : ");
        Scanner scanner = new Scanner(System.in);
        circle.setRadius(scanner.nextFloat());
        System.out.println("Input Color : ");
        circle.setColor(scanner.nextLine());
        scanner.close();
        circle.ShowInformation();
    }
}
