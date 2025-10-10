import java.util.*;

public class Shapes {
    public static void main(String args[]){
    }
    
    public class Point{
      private int x; 
      private int y;
      public Point(int x, int y){
        this.x = x;
        this.y = y;
      }

    }

    public interface ShapeInterface {
    String getName();
    void setName(String name);
    double getPerimeter();
    double getArea();
    void showInfo();
    String getInfo();
    }

      public static class ShapeFactory {

    public static class Builder {
        private final String shapeType; 
        private String name;
        private Point[] points;
        private Point center;
        private int radius;

        public Builder(String shapeType) {
            this.shapeType = shapeType;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder points(Point[] values) {
            this.points = values;
            return this;
        }

        public Builder center(Point value) {
            this.center = value;
            return this;
        }

        public Builder radius(int value) {
            this.radius = value;
            return this;
        }

    
        
    }

    public static Builder create(String shapeType) {
        return new Builder(shapeType);
    }
}
    
    public class Shape {
  
        protected String name;
        protected double perimeter;
        protected double area;


        protected double calculateArea(){ 
            return calculateArea();
            
        }
        protected double calculatePerimeter(){
            return calculatePerimeter();
        }


    }

    public class Rectangle extends Shape {
       private Point[] points;

        public Rectangle(String name, Point[] points){}

        @Override
        protected double calculatePerimeter() {
            return calculateArea();
        }

        @Override
        protected double calculateArea() {
             return calculatePerimeter();
        }

    }

       public class Circle extends Shape {
        private Point center;
        private int radius;

        public Circle(String name, Point center, int radius){}

        @Override
        protected double calculatePerimeter() {
            return calculateArea();
        }

        @Override
        protected double calculateArea() {
            return calculatePerimeter();
        }

    }

       public class Polygon extends Shape {
       private Point[] points;

        public Polygon(String name, Point[] points){}

        @Override
        protected double calculatePerimeter() {
            return calculateArea();
        }

        @Override
        protected double calculateArea() {
            return calculatePerimeter();
        }

    }
    
    public class ShapeUnit {
    public double distance(Point p1, Point p2) {
        return 0;
    }
    }
    public class ShapeException extends Exception {
    public ShapeException(String message) {}
    }




}