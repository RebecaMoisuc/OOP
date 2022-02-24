package ro.ItSchool.incapsulation.rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(1);
        rectangle.setLength(1);

        System.out.println("Get area of rectangle: " + rectangle.getArea());
        System.out.println("Get perimeter of rectangle: " + rectangle.getPerimeter());
    }
}
