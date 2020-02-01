//2. Write a class with the name Cylinder that extends Circle class.
// The class needs one field (instance variable) with name height of type double.
//
//        The class needs to have one constructor with two parameters radius and height both of type double.
//        It needs to call parent constructor and initialize a height field.
//
//        In case the height parameter is less than 0 it needs to set the height field value to 0.
//
//        Write the following methods (instance methods):
//        * Method named getHeight without any parameters, it needs to return the value of height field.
//        * Method named getVolume without any parameters, it needs to return the calculated volume.
//        To calculate volume multiply the area with height.

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
public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height= (height<0) ? 0 : height;
    }
    public double getVolume(){
        return getHeight()*super.getArea();
    }
}
