//1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
//
//        The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
//        In case the radius parameter is less than 0 it needs to set the radius field value to 0.
//        Write the following methods (instance methods):
//        * Method named getRadius without any parameters, it needs to return the value of radius field.
//        * Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI).
//        For PI use Math.PI constant.
//
//        TEST EXAMPLE
//
//        → TEST CODE:
//
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
//
//        → OUTPUT
//
//        circle.radius= 3.75
//        circle.area= 44.178646691106465
//        cylinder.radius= 5.55
//        cylinder.height= 7.25
//        cylinder.area= 96.76890771219959
//        cylinder.volume= 701.574580913447
//
//        NOTE: All methods should be defined as public NOT public static.
//        NOTE: In total, you have to write 2 classes.
//        NOTE: Do not add a main method to the solution code.
public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius= (radius<0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (radius*radius*Math.PI);
    }
}
