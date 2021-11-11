import java.util.Scanner;

public class Rectangle {
    private float length;
    private float width;

    Rectangle() {
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    void ShowInformation() {
        System.out.println("Length : " + length + "\nWidth : " + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of rectangle : ");
        rectangle.setLength(scanner.nextFloat());
        System.out.println("Input width of rectangle : ");
        rectangle.setWidth(scanner.nextFloat());
        scanner.close();
        rectangle.ShowInformation();
    }
}
