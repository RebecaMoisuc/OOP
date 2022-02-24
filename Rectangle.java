package ro.ItSchool.incapsulation.rectangle;

public class Rectangle {

    private double width;
    private double length;

    public void setWidth(int width){
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }
}

