public class test {
    public static void main(String[] args) {
//        double var1 = 20.00;
//        double var2 = 80.00;
//        double var3 = (var1 + var2) * 100.00;
//        double var4 = var3 % 40.00;
//        boolean var5 = (var4 == 0) ? true : false;
//        System.out.println("Output bool is " + var5);
//        if (!var5) {
//            System.out.println("Got some remainder");
//        }
//        testSimpleCalculator calculator=new testSimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
//        testPerson person = new testPerson();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(-19);
//        System.out.println("age=" +person.getAge());
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());
//


//Scanner var=new Scanner(System.in);
//System.out.print("Enter the Account holder's name: ");
//String name=var.nextLine();
//System.out.print("Account Number for "+name+" = ");
//long accountNumber=var.nextLong();
//System.out.print("Balance of "+name+" for account number "+accountNumber+" = ");
//double balance=var.nextDouble();
//var.nextLine();
//System.out.print("Email ID of "+name+" = ");
//String mail=var.nextLine();
//System.out.print("Enter mobile number of "+name+" =");
//String mobNum=var.nextLine();
//testBankAccount ashwinaccount=new testBankAccount(accountNumber,balance,name,mail,mobNum);
//var.nextLine();
//System.out.print("Enter the Amount to withdraw = ");
//double debit=var.nextDouble();
//ashwinaccount.debitAmount(debit);

//        testVipCustomer VIP=new testVipCustomer();
//        System.out.println(VIP.getName()+" with email ID = "+VIP.getEmail()+" has credit limit of "+VIP.getLimit()+" Rs.");
//        testVipCustomer VIP2=new testVipCustomer(50000,"ashwin2@email.com");
//        System.out.println(VIP2.getName()+" with email ID = "+VIP2.getEmail()+" has credit limit of "+VIP2.getLimit()+" Rs.");
//        testVipCustomer VIP3=new testVipCustomer("Meghu",50000,"meghu@email.com");
//        System.out.println(VIP3.getName()+" with email ID = "+VIP3.getEmail()+" has credit limit of "+VIP3.getLimit()+" Rs.");
//
//TestWallConstructor wall = new TestWallConstructor(5,4);
//System.out.println("area= " + wall.getArea());
//wall.setHeight(-1.5);
//System.out.println("width= " + wall.getWidth());
//System.out.println("height= " + wall.getHeight());
//System.out.println("area= " + wall.getArea());

//        testPoint first=new testPoint(6,5);
//        testPoint second = new testPoint(3, 1);
//       System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//       System.out.println("distance(2,2)= " + first.distance(2, 2));
//        testPoint point = new testPoint();
//       System.out.println("distance()= " + point.distance());


//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
////        dog.eat();
//        dog.walk();
//////        dog.run();
//        vehicle vehicle1=new vehicle(10);
//        vehicle1.getSpeed();
//               Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//                Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
                Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
                Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}