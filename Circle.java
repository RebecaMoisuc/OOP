package ro.ItSchool.incapsulation;

public class Circle {

   private double radius;
   private final double PI = 3.14;

   public Circle(){
       radius = 0.0;
   }
   public Circle(double radius){
       this.radius = radius;
   }
   public void setRadius(double r){
       this.radius = r;
   }

   public double getRadius(){
       return radius;
   }

   public double getArea(){
       return PI * radius * radius;
   }

}


