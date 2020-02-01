//        2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
//        The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
//        In case the cost parameter is less than 0 it needs to set the cost field value to 0.
//        Write the following methods (instance methods):
//        * Method named getCost without any parameters, it needs to return the value of cost field
//        TEST EXAMPLE
//        → TEST CODE:
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//
//        → OUTPUT
//        total= 38.5
//        total= 36.45
public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }
    public double getCost() {
        return cost;
    }
}
