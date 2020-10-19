import java.util.ArrayList;
import java.util.Scanner;

public class test {
    private static Scanner number = new Scanner(System.in);
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
//                Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//                Cuboid cuboid = new Cuboid(5,10,5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());


//        Nano nano = new Nano(36);
//        nano.steer(45);
//        nano.accelerate(30);
//        nano.accelerate(20);
//        nano.accelerate(-42);
//        vehicle testVehicle = new vehicle();
//
//        Dimensions myPcDimensions = new Dimensions(15,10,4);
//        Case myCase = new Case("XPS","Dell","240",myPcDimensions);
//        Resolution resolution = new Resolution(15,10);
//        Monitor myMonitor = new Monitor("21 inch all purpose","Apple",21,resolution);
//        Motherboard  motherboard = new Motherboard("AP-200","Intel",4,6,"v3.1");
//        PC newPc = new PC(myCase,myMonitor,motherboard);
//        //System.out.println(newPc.getMonitor().getManufacturer());
//        newPc.getTheCase().pressPowerButton();
//        newPc.getMotherboard().loadProgram("Android studio");
//        double volume = newPc.getTheCase().getDimensions().volumeOfThing();
//        System.out.println("Volume of the case is " + volume);

//          int max = Integer.MAX_VALUE;
//        System.out.println(max);

//        Printer hp_printer = new Printer(40,true);
//        int test = hp_printer.addToner(40);
//        //System.out.println(test);
//        int pagesPrinted = hp_printer.printPages(5);
//        System.out.println("pages printed in this run " + pagesPrinted);
//        System.out.println("Total pages printed " +hp_printer.getPagesPrinted());
//        pagesPrinted = hp_printer.printPages(4);
//        System.out.println("pages printed in this run " + pagesPrinted);
//        System.out.println("Total pages printed " +hp_printer.getPagesPrinted());

//        int[] myTestArray = new int[100];
//
//        System.out.print("Enter the first number in AP :");
//        int a1 = number.nextInt();
//        System.out.println("Enter the common difference :");
//        int cd = number.nextInt();
//        System.out.println("Enter the number of elements to  be printed in the AP :");
//        int num = number.nextInt();
//
//        for(int i=1;i<=num;i++) {
//            myTestArray[i] = a1+(i-1)*cd;
//            System.out.println("Element at position " + i + " is " +myTestArray[i]);
//        }

        //        sortArray(firstIntArray);
//        System.out.println("\n");
//        System.out.println("Sorted Array is : ");
//        printArray(firstIntArray);
//        for(int i=0;i<firstIntArray.length;i++) {
//            System.out.println("Element at position " + i + " is " +firstIntArray[i]);
//        }


//        System.out.println("Enter the number of elements to be present in Array : ");
//        int num = number.nextInt();
//        int[] firstIntArray = getIntegers(num);
//        printArray(firstIntArray);
//        System.out.println("\n");
//        System.out.println("Enter the number to check if it's present in Array : ");
//        int numToCheck = number.nextInt();
//        existsInArray(firstIntArray,numToCheck);

//        int [][]a = new int[10][10];
//        for(int i = 0; i < 10; i++)
//        {
//            for(int j = 0; j < 10; j++)
//            {
//                System.out.printf("- ", a[i][j]);
//            }
//            System.out.println();
//        }

//        System.out.println("Enter the number of elements to be present in Array : ");
//       int num = number.nextInt();
//       int[] firstIntArray = getIntegers(num);
//        System.out.println(" Array is : " +Arrays.toString(firstIntArray));
//        //printArray(firstIntArray);
//        System.out.println("\n");
//        //System.out.println("Array is " + firstIntArray);
//        reverseArray(firstIntArray);
//        System.out.println(" Reversal of array is : " + Arrays.toString(firstIntArray));
        //printArray(firstIntArray);
        //System.out.println("Reversal of array is " + firstIntArray);

//        maxAndMinSimple2(firstIntArray);
  //      maxAndMinElement(firstIntArray);
        //System.out.println("Sum of the elements of the array is : " +arraySum(firstIntArray));
//        arraySum(firstIntArray);
//        int numToCheck = number.nextInt();
//        existsInArray(firstIntArray,numToCheck);

//        ArrayList<String> testArrayList = new ArrayList<>(11);
//        testArrayList.add("test1");
//        testArrayList.add("Test2");
//        testArrayList.add("tenth");
//        testArrayList.set(2,"Two");
//        testArrayList.get(3);
//        System.out.println(testArrayList);
        ArrayList<String> test = addListItems(5);
        System.out.println("Array list is " + test );

    }

       public static void printArray(int[] array) {
           System.out.print("Array is : {");
           for (int i=0;i<array.length;i++) {
               if(i == ((array.length) -1 )) {
                   System.out.print(array[i]);
               }
               else {
                   System.out.print(array[i] + ",");
               }
           }
           System.out.print("}");
       }
       public static int[] getIntegers(int num) {
            System.out.println("Enter " + num + " integer values : \r");
            int[] values = new int[num];
            for(int i=0;i<values.length;i++){
                    values[i] = number.nextInt();
            }
            return values;
        }

        public static int[] sortArray(int[] unsortedArray) {
         int [] sortedArray = unsortedArray;
         int temp;
         for (int i = 0;i < unsortedArray.length;i++) {
             for(int j = i+1;j < unsortedArray.length;j++) {
                 if(unsortedArray[i] < unsortedArray[j]) {
                      temp = unsortedArray[i];
                     unsortedArray[i] = unsortedArray[j];
                     unsortedArray[j] = temp;
                 }
             }
         }
         return sortedArray;
        }

        public static boolean existsInArray(int[] array ,int num) {
         for(int i=0;i<array.length;i++ ) {
             if (array[i] == num) {
                 System.out.println("Entered number " + num + " is present at " + i + " position in the Array");
                 return true;
             }
         }
            System.out.println("Entered number " + num + " is not present in the Array");
         return false;
        }

       public static int arraySum(int[] array) {
        int sum =0;
        for(int i=0;i<array.length;i++ ) {
            sum += array[i];
        }
        System.out.println("Sum of all the elements in the array is " + sum );
        return sum;
    }

    public static double arrayAvg(int[] array) {
        int avg =0,sum=0;
        for(int i=0;i<array.length;i++ ) {
            sum += array[i];
        }
        System.out.println("Sum of all the elements in the array is " + sum );
        return sum;
    }

    public static void maxAndMinElement(int[] array) {
        int temp;
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Maximum number in the array is " + array[0]);
        System.out.println("Minimum number in the array is " + array[array.length-1]);
        //return array[0];
    }

    public static void maxAndMinSimple1(int[] array) {
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++) {
            if(max < array[i]) {
                max = array[i];
            }
            if(min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Maximum number in the array is " + max);
        System.out.println("Minimum number in the array is " + min);
    }
    public static void maxAndMinSimple2(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //int max,min;
        boolean isOdd = (array.length % 2 != 0) ? true :false;
        int n = array.length;
        if(isOdd) {
            n--;
        }
        for(int i=0;i < n;i = i+2) {
            int tempMax,tempMin;
            if(array[i] > array[i+1]) {
                tempMax = array[i];
                tempMin = array[i+1];
            }
            else {
                tempMax = array[i+1];
                tempMin = array[i];
            }
            if(tempMax > max) {
                max = tempMax;
            }
            if(min > tempMin) {
                min = tempMin;
            }

            if(isOdd) {
                if(array[n] > max ) {
                        max = array[n];
                }
                if(array[n] < min ) {
                    min = array[n];
                }
            }
        }
        System.out.println("Maximum number in the array is " + max);
        System.out.println("Minimum number in the array is " + min);
    }

    public static void reverseArray(int[] array) {
        int temp;
        int  n = array.length;
        for(int i=0;i<array.length/2;i++) {
            temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
    }

    public static ArrayList<String> addListItems(int num){
        System.out.println("Enter " + num + " Array values : \r");
        ArrayList<String> itemList = new ArrayList<>(num);
        while(itemList.size() < num){
            itemList.add(number.next());
        }
       // int a = Math.pow()
        return itemList;

    }
    String A = "abc";
    String B = "csd";
    int a = A.compareTo(B);



}


